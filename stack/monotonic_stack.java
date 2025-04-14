package stack;

import java.util.*;

public class monotonic_stack {
    public static void main(String[] args) {


        // left closest, just smaller element

        int[] array = {3, 2, 3, 1, 5};
        int arrayLength = array.length;
        // -1,2,3,3,5
        int[] ans = new int[arrayLength];
        Stack<Integer>stack = new Stack<>();

        for(int i=0;i<arrayLength;i++){
            while(!stack.isEmpty() && stack.peek() >= array[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(array[i]);
        }
        System.out.println("Left closest element, just smaller"+Arrays.toString(ans));

        // right closest, just smaller element

//        -1,1,1,-1

        int[] ans1 = new int[arrayLength];
        Stack<Integer>stack1 = new Stack<>();

        for(int i = arrayLength-1;i>=0;i--){
            while(!stack1.isEmpty() && stack1.peek() >= array[i]){
                stack1.pop();
            }
            ans1[i] = stack1.isEmpty() ? -1 : stack1.peek();
            stack1.push(array[i]);
        }
        System.out.println("right closest, just smaller element: "+Arrays.toString(ans1));

//        left closest, just bigger element

        int[] ans2 = new int[arrayLength];
        Stack<Integer>stack2 = new Stack<>();

        for(int i = 0;i<arrayLength;i++){
            while(!stack2.isEmpty() && stack2.peek() <= array[i]){
                stack2.pop();
            }
            ans2[i] = stack2.isEmpty() ? -1 : stack2.peek();
            stack2.push(array[i]);
        }
        System.out.println("Left Closest Just Bigger: "+Arrays.toString(ans2));

//        right Closest Just Bigger

        int[] ans3 = new int[arrayLength];
        Stack<Integer>stack3 = new Stack<>();

        for(int i = arrayLength-1;i>=0;i--){
            while(!stack3.isEmpty() && stack3.peek() <= array[i]){
                stack3.pop();
            }
            ans3[i] = stack3.isEmpty() ? -1 : stack3.peek();
            stack3.push(array[i]);
        }
        System.out.println("Right Closest Just Bigger: "+Arrays.toString(ans3));

        

        /*

        Direction (Loop):
        ++ (left to right) for left side checks.
        -- (right to left) for right side checks.

        Pop Condition (While):
        >= (greater than or equal) when you’re looking for a smaller element.
        <= (less than or equal) when you’re looking for a bigger element.

        //////////

        1. Left Closest Just Smaller Element:
        Loop: ++ (Go left to right)
        While condition: >= (Pop elements that are greater than or equal to the current element)

        2. Right Closest Just Smaller Element:
        Loop: -- (Go right to left)
        While condition: >= (Pop elements that are greater than or equal to the current element)

        3. Left Closest Just Bigger Element:
        Loop: ++ (Go left to right)
        While condition: <= (Pop elements that are less than or equal to the current element)

        4. Right Closest Just Bigger Element:
        Loop: -- (Go right to left)
        While condition: <= (Pop elements that are less than or equal to the current element)

         */
    }
}