package two_pointers;
import java.util.*;
public class leetcode_373 {
    public static void main(String[] args) {
        int[] input1 = {1,1,2};
        int[] input2 = {1,2,3};
        int k = 3;

        int input1Length = input1.length;
        int input2Length = input2.length;

        List<List<Integer>>allPairs = new ArrayList<>();
        List<List<Integer>>smallestSumPairs = new ArrayList<>();

        for(int i = 0; i<input1Length;i++){
            for(int j = 0;j<input2Length;j++){
                allPairs.add(Arrays.asList(input1[i], input2[j]));
            }
        }
        System.out.println(allPairs);
        allPairs.sort((a, b) -> (a.get(0) + a.get(1)) - (b.get(0) + b.get(1)));
        System.out.println(allPairs);

        for(int i = 0;i<k;i++){
            smallestSumPairs.add(allPairs.get(i));
        }
        System.out.println(smallestSumPairs);
    }
}
