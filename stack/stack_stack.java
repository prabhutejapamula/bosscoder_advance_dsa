package stack;
import java.util.Stack;

public class stack_stack {
public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(1);
    stack.push(3);
    stack.push(7);
    System.out.println(stack);
    stack.push(7);
    System.out.println(stack);
    stack.push(7);
    System.out.println(stack);

    System.out.println("pop: " + stack.pop());
    System.out.println("peek: " + stack.peek());
    System.out.println("isEmpty: " + stack.isEmpty());
    // stack.clear();
    System.out.println(stack.contains(3 ));
}
}
