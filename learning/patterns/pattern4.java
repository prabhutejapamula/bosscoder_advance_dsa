package learning.patterns;
import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        /*
        n=4;
        then print,
        ****
        ***
        **
        *
         */
    Scanner sc = new Scanner(System.in);
    List<String> result = new ArrayList<>();
    int input = sc.nextInt();
    for(int i = 1; i<=input;i++){
        String st = "";
        for(int j = 0; j<=input-i;j++){
            st+="*";
        }
        result.add(st);
    }
        System.out.println(result);
    }

}
