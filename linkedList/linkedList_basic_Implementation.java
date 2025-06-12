package linkedList;

public class linkedList_basic_Implementation {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(3);
        Node third = new Node(7);

        head.next = second;
        second.next = third;

        Node current = head;

        while(current != null){
            System.out.println(current.data);
            System.out.println(current.next);
            current = current.next;
        }

    }
}
class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}