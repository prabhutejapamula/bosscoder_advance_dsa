package stack;

class stack_Array{
    private int[] stack;
    private int top;
    private int capacity;
    
    public stack_Array(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x){
        if(top == capacity - 1){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }
    
}

class Main {
public static void main(String[] args) {
    stack_Array stack = new stack_Array(3);
    stack.push(1);
    stack.push(3);
    stack.push(7);
    System.out.println(stack);
    stack.pop();
    System.out.println(stack);
    System.out.println(stack.isEmpty());
    stack.push(7);
    System.out.println(stack.isFull());
}
}