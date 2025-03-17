package linkedList;

import java.util.*;

public interface linkedList {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);

        LinkedList<Integer> linkedList = new LinkedList<>();

        // works like a stack
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.pop();
        System.out.println(linkedList);

        // works like a queue
        LinkedList<Integer> linkedListQueue = new LinkedList<>();
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(4);
        linkedListQueue.offer(6);
        linkedListQueue.add(2, 3);
        linkedListQueue.add(4,5);
        linkedListQueue.remove();
        linkedListQueue.pop();
        linkedListQueue.poll();
        System.out.println(linkedListQueue);
        // System.out.println(linkedListQueue.peekLast());
        // System.out.println(linkedListQueue.peekFirst());
        // linkedListQueue.addLast(7);
        // linkedListQueue.addFirst(0);
        // System.out.println(linkedListQueue);



    }
}
