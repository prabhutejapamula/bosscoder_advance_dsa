package two_pointers;

public class leetcode_264 {

    static boolean isUgly(int ugly){
        while(ugly%2==0){
            ugly /= 2;
        }
        while(ugly%3==0){
            ugly /= 3;
        }
        while(ugly%5==0){
            ugly /= 5;
        }
        return ugly==1;
    }   

    static int[] getNUglyNumbers(int ugly){
        int count = 0;
        int current = 1;
        int[] result = new int[ugly];

        while(count < ugly){
            if(isUgly(current)){
                result[count] = current;
                count++;
            }
            current++;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        int[] answer = getNUglyNumbers(n);

        for(int nums: answer){
            System.out.println(nums + " ");
        }
    }
}
