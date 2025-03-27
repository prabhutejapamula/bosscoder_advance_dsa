package learning.bosscoder;
import java.util.*;
public class p131_Immediate_Smaller_Element {
    public static void main(String[] args) {
        /*
        Given an integer array Arr of size N. For each element in the array, check whether the right adjacent element (on the next immediate position) of the array is smaller. If next element is smaller, update the current index to that element. If not, then -1.
        Input:
        Arr[] = {4, 2, 1, 5, 3}
        Output:
        2 1 -1 3 -1
         */

        /*
        thoughts:
        first loop thru the whole array.
        check if the ith index is greater than ith + 1
        if so then arr[i] = i+1; if not arr[i] = -1;
         */

        int[] array = {4,2,1,5,3};
        int arrSize = array.length;
        for(int i = 0; i<arrSize-1;i++){
//            if(array[i] == array[arrSize-1]){
//                array[i] = -1;
//                break;
//            }
            if(array[i] > array[i+1]){
                array[i] = array[i+1];
            } else {
                array[i] = -1;
            }
        }
        array[arrSize-1] = -1;
        System.out.println(Arrays.toString(array));
    }
}
