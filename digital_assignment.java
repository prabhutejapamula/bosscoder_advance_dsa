import java.util.Scanner;

public class digital_assignment {
    public static void main(String[] args) {
        final int CLASS_STRENGTH = 10;
        int[] marks = new int[CLASS_STRENGTH];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < CLASS_STRENGTH; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        double average = (double) sum / CLASS_STRENGTH;
        System.out.println("\nClass Average for Java FAT exam: " + average);

        scanner.close();
    }
}
