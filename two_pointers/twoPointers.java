package two_pointers;

public class twoPointers {
    public static void main(String[] args) {
        /*
        so two pointer is an algorithm, where we have 2 pointers where one starts with the beginning of the array and another pointer has the value of end of the array.

        with these 2 points we navigate thru the array. If suppose you searching th array for a certain value, if the value is higher than the end we do end-- and if value is less than the end then we do start ++;

        to move around we use start and end;

        end-- when the value is greater than the available element.
        start++ when the value is less than the available element.
         */

        // for suppose in the below given array find the target which sums up and return index

        int[] array = {1,2,3,7,9};
        int target = 12;

        int sizeOfArray = array.length;

        int start = 0;
        int end = sizeOfArray-1;

        while(start < end){
            int sum = array[start] + array[end];

            if(sum == target){
                System.out.println("Hurray we found the answer! " + array[start] + " + " + array[end] + " = " + target);
                break;
            }

            if(sum < target){
                start++;
            } else {
                end--;
            }
        }

        //problem 2:
        // suppose in the below given 2 arrays find the target which sums up and return index


        int[] arrayOne = {5,7,12,20,25,40};
        int[] arrayTwo = {2,4,10,20};
        int targetProblem2 = 16;

        int arrayTwoSize = arrayTwo.length;

        int leftPointer = 0;
        int rightPointer = arrayTwoSize-1;

        while(leftPointer < arrayTwoSize && rightPointer >= 0){

            int sum = arrayOne[leftPointer] + arrayTwo[rightPointer];

            if(sum == targetProblem2){
                System.out.println("Hurray we found the answer! for two arrays " + arrayOne[leftPointer] + " + " + arrayTwo[rightPointer] + " = " + targetProblem2);
                break;
            }

            if(sum < targetProblem2){
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

    }
}
