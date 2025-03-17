package stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class p496_nextGreatestElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        int[] ans = new int[nums1Length];

        for(int i = 0; i < nums1Length; i++){
            int index = -1;
            for(int j = 0; j < nums2Length; j++){
                if(nums2[j] == nums1[i]){
                    index = j;
                    break;
                }
            }

            int greaterElements = -1;
            for(int j = index + 1; j < nums2Length; j++){
                if(nums2[j] > nums1[i]){
                greaterElements = nums2[j];
                break;
            }
            }
            ans[i] = greaterElements;
        }
        System.out.println(Arrays.toString(ans));
    }
}
