package learning.patterns;
import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        /*
        n=4;
        then print,
        a
        ab
        abc
        abcd
         */
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        int input = sc.nextInt();
        System.out.println("User has entered: "+input);
        for(int i = 1;i<=input;i++){
            String st = "";
            for(char j = 'a'; j<'a'+i;j++){
                st+=j;
            }
            result.add(st);
        }
        System.out.println(result);
    }
}
