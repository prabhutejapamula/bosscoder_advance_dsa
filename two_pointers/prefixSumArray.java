package two_pointers;

import java.util.Arrays;

public class prefixSumArray {
    public static void main(String[] args) {
        /*
        Array:       [1, 2, 3, 4, 5]
        Prefix Sum:  [1, 3, 6, 10, 15]
         */
        int[] array = {1,2,3,4,5};
        int arraySize = array.length;
        int[] prefix = new int[arraySize];

        prefix[0] = array[0];

        for(int i = 1;i<arraySize;i++){
            prefix[i] = prefix[i-1] + array[i];
        }
        System.out.println(Arrays.toString(prefix));
        }
    }
