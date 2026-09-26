//Check whether the given linked list is either NULL-terminated or ends in a cycle


public class CycleCheck {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        CycleCheck obj = new CycleCheck();

        // Case 1: NULL Terminated
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        System.out.println("List 1 (Is Cyclic?): " + obj.hasCycle(head1));

        // Case 2: Ends in Cycle
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = head2;
        System.out.println("List 2 (Is Cyclic?): " + obj.hasCycle(head2));
    }
}