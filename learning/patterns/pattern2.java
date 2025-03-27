package learning.patterns;
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        /*
        n=4;
        then print,
        *
        **
        ***
        ****
         */
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("User has entered: "+input);
        List<String> result = new ArrayList<>();
        for(int i = 1; i<=input;i++){
            String mix = "";
            for(int j = 1; j<=i;j++){
                mix+="*";
            }
            result.add(mix);
        }
        System.out.println(result);
    }
}
