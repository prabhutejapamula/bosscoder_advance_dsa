package linkedList;

public class leetcode_25{
    public static void main(String[] args) {
        
    }
}


class Solution {
    public int lengthOfLinkedList(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        if (lengthOfLinkedList(head) < k) {
            return head;
        }

        int count = 0;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = null;

        while (curr != null && count < k) {
            fwd = curr.next;
            curr.next = prev; // made a new connection
            prev = curr;
            curr = fwd;
            count++;
        }

        // recursive call
        if (fwd != null) {
            head.next = reverseKGroup(fwd, k);
        }

        return prev;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Example usage (for demonstration)
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        int k = 2;
        ListNode reversedHead = solution.reverseKGroup(head, k);

        // Print the reversed linked list
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null"); // Output: 2 -> 1 -> 4 -> 3 -> 5 -> null
    }
}