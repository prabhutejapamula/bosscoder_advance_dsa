package learning.bosscoder;

import java.util.Arrays;

public class p121_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        /*
        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
        Input:
        s = "leetcode"
        Output:
        0
        Explanation:
        'l' is the first non-repeating character in it which is present at index 0.
         */

        /*
        thoughts:
        take a loop to capture an element in the string
        take another loop to compare the captured element with other elements
        if we find same element then break the loop and first loop++
        if no element is same as the captured element then return the char (either store it in a variable or direct return)
        if no element is not unique then return -1;
         */

        String s = "loveleetcode";
        int sizeOfString = s.length();
        int[] charCount = new int[26];
        int ans = -1;

//        for(char c : s.toCharArray()){
//            charCount[c-'a']++;
//        }

        for(int i = 0; i<sizeOfString;i++){
            charCount[s.charAt(i)-'a']++;
        }

        for(int i = 0; i<sizeOfString;i++){
            if(charCount[s.charAt(i)-'a'] == 1){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
