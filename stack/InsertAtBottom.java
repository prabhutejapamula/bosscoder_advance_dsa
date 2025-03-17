package stack;

import java.util.Stack;

public class InsertAtBottom {
    public static void insertAtBottom(Stack<Integer> stack, int value) {
        
        // Naive approach
        
        // Stack<Integer> temp = new Stack<>();
        // while(!stack.isEmpty()){
        //     temp.push(stack.peek());
        //     stack.pop();
        // }
        // stack.push(value);
        // while(!temp.isEmpty()){
        //     stack.push(temp.peek());
        //     temp.pop();
        // }
        // while(!stack.isEmpty()){
        //     System.out.print(stack.peek() + ", ");
        //     stack.pop();
        // }
        // tc: O(n), sp: O(1), auxiliary space: O(N)


        // Efficient approach
        
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);
        insertAtBottom(stack, 4);
        System.out.println(stack);

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
