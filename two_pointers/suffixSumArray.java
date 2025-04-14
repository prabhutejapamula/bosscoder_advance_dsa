package two_pointers;

import java.util.Arrays;

public class suffixSumArray {
    public static void main(String[] args) {
        /*
        Array:       [1, 2, 3, 4, 5]
        Suffix Sum:  [15, 14, 12, 9, 5]
         */

        int[] array = {1,2,3,4,5};
        int lengthOfArray = array.length;
        int[] suffixSumArray = new int[lengthOfArray];
        suffixSumArray[lengthOfArray-1] = array[lengthOfArray-1];

        for(int i = lengthOfArray-2;i>=0;i--){
            suffixSumArray[i] = suffixSumArray[i+1] + array[i];
        }

        System.out.println(Arrays.toString(suffixSumArray));
    }
}
