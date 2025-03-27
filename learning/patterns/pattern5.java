package learning.patterns;
import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        /*
        n=4;
        then print,
        ****
        *__*
        *__*
        ****
         */
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        int input = sc.nextInt();
        for(int i = 0; i<input;i++){
            String st = "";
            for(int j = 0; j<input;j++){
                if(i == 0 || i == input -1 || j == 0 || j == input - 1){
                    st+="*";
                } else {
                    st+="_";
                }
            }
            result.add(st);
        }
        System.out.println(result);
    }
}
