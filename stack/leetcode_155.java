package stack;

import java.util.*;

public class leetcode_155 {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(11);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.getMin());
    }
}
class MinStack {

    public Stack<Pair> stack;

    public MinStack() {
    stack = new Stack<>();
    }

    public void push(int val) {
        int min = stack.isEmpty() ? val : stack.peek().min;
        stack.push(new Pair(val, min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public Stack<Pair> stack(){
        return stack;
    }

    public int getMin() {
        return stack.peek().min;
    }
}

class Pair {
    int val;
    int min;

    Pair(int val,int min){
        this.val = val;
        this.min = min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */