package learning.patterns;
import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        /*
        n=4;
        then print,
        1
        12
        123
        1234
         */
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        int input = sc.nextInt();
        System.out.println("User has entered: " + input);
        for(int i = 1;i<=input;i++){
            String st = "";
            for(int j = 1; j<=i;j++){
                st+=j;
            }
            result.add(st);
        }
        System.out.println(result);
    }
}
