package learning.patterns;
import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        /*
        n=4;
        then print,
        ****
        ****
        ****
        ****
         */
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();
    System.out.println("User had entered: " + input);
    List<String> result = new ArrayList<>();

        for(int i = 1; i<=input;i++){
            String unite = "";
            for(int j = 1; j<=input;j++){
//                System.out.print("*");
                unite += "*";
//                result.add("*");
            }
//            System.out.println();
            result.add(unite);
        }
        System.out.println(result);
    }
}
