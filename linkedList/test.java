import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CreditLimitExceededException extends Exception {
    private String courseCode;
    private int credits;

    public CreditLimitExceededException(String courseCode, int credits, String message) {
        super(message);
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return getMessage() + " [Course: " + courseCode + ", Credits: " + credits + "]";
    }
}

class Course {
    private String code;
    private String name;
    private int credits;

    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return code + " - " + name + " (" + credits + " credits)";
    }
}

class Student {
    private String id;
    private String name;
    private List<Course> registeredCourses;
    private int maxCredits;

    public Student(String id, String name, int maxCredits) {
        this.id = id;
        this.name = name;
        this.maxCredits = maxCredits;
        this.registeredCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) throws CreditLimitExceededException {
        int totalCredits = getTotalRegisteredCredits();

        if (totalCredits + course.getCredits() > maxCredits) {
            throw new CreditLimitExceededException(
                    course.getCode(),
                    course.getCredits(),
                    "Cannot register for " + course.getCode() + ". Credit limit would be exceeded."
            );
        }

        registeredCourses.add(course);
        System.out.println("✓ Successfully registered for: " + course);
    }

    public int getTotalRegisteredCredits() {
        return registeredCourses.stream().mapToInt(Course::getCredits).sum();
    }

    public void displayRegisteredCourses() {
        System.out.println("\n=== Registration Summary ===");
        System.out.println("Student: " + name + " (ID: " + id + ")");
        System.out.println("Credit Status: " + getTotalRegisteredCredits() + "/" + maxCredits);
        System.out.println("\nRegistered Courses:");
        if (registeredCourses.isEmpty()) {
            System.out.println("No courses registered yet");
        } else {
            registeredCourses.forEach(System.out::println);
        }
        System.out.println("==========================");
    }
}

public class test {
    private static final Course[] AVAILABLE_COURSES = {
            new Course("SDS", "Statistics for Data Science", 4),
            new Course("CN", "Computer Networks", 3),
            new Course("SE", "Software Engineering", 3),
            new Course("PJ", "Programming In Java", 4),
            new Course("AI", "Artificial Intelligence", 4)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== University Course Registration System ===");
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter maximum credit limit: ");
        int maxCredits = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Student student = new Student(studentId, studentName, maxCredits);

        while (true) {
            System.out.println("\nAvailable Courses:");
            for (int i = 0; i < AVAILABLE_COURSES.length; i++) {
                System.out.println((i+1) + ". " + AVAILABLE_COURSES[i]);
            }
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice (1-5 to register, 0 to exit): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 0) {
                break;
            }

            if (choice < 1 || choice > AVAILABLE_COURSES.length) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            Course selectedCourse = AVAILABLE_COURSES[choice-1];

            try {
                student.registerCourse(selectedCourse);
            } catch (CreditLimitExceededException e) {
                System.err.println("❌ Error: " + e);
                System.out.println("Current credits: " + student.getTotalRegisteredCredits() + "/" + maxCredits);
            }

            student.displayRegisteredCourses();
        }

        System.out.println("\nFinal Registration Details:");
        student.displayRegisteredCourses();
        System.out.println("Thank you for using the registration system!");
        scanner.close();
    }
}