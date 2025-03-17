package stack;

import java.util.*;

class stackArrayList {
    private ArrayList<Integer> stack;

    public stackArrayList(){
        stack = new ArrayList<>();
    }

    public void push(int x){
        stack.add(x);
    }

    public int pop(){
        if(stack.isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

        public static void main(String[] args) {
            stackArrayList stack = new stackArrayList();
    
            stack.push(1);
            stack.push(3);
            stack.push(7);
            System.out.println(stack);
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.isEmpty());        
        }
}