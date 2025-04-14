import java.util.*;

public class leetcode_3 {
    public static void main(String[] args) {
        String word = "bbbbb";
        int wordLength = word.length();

        //brute force
//        int[] lastIndex = new int[128];
//        int lastIndexLength = lastIndex.length;
//        for(int i =0;i<lastIndexLength;i++){
//            lastIndex[i] = -1;
//        }
//
//        int start = 0;
//        int maxLength = 0;
//
//        for(int end = 0;end<wordLength;end++){
//            char ch = word.charAt(end);
//            if(lastIndex[ch] >= start){
//                start = lastIndex[ch]+1;
//            }
//            lastIndex[ch] = end;
//            maxLength = Math.max(maxLength, end-start+1);
//            System.out.println("end: "+end);
//            System.out.println("start: "+start);
//        }
//        System.out.println(Arrays.toString(lastIndex));
//        System.out.println(maxLength);

        // hashmap

        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for(int right = 0; right<wordLength;right++){
            char ch = word.charAt(right);
            while(set.contains(ch)){
                set.remove(word.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, right-left+1);
        }
        System.out.println(max);
    }
}
