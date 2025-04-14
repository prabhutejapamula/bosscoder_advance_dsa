package two_pointers;

import java.util.Arrays;

public class leetcode_658 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int k = 4; // number of elements
        int x = 10; // closet to

        int arrayLength = array.length;
        int left = 0;
        int right = arrayLength-1;

        while(right-left+1 > k){
        if(Math.abs(array[left]-x) > Math.abs(array[right]-x)){
            left++;
        } else {
            right--;
        }
        }

        int[] answer = new int[k];
        int index= 0;
        for(int i = left; i<=right;i++){
            answer[index++] = array[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
