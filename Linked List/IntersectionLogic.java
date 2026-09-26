//Two Singly Linked is given which intersect at same point and becomes singly linked list

class Node43 {
    int data;
    Node next;
    Node43(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntersectionLogic {

    public static Node findIntersection(Node head1, Node head2) {
        int l1 = getLength(head1);
        int l2 = getLength(head2);

        Node ptr1 = head1;
        Node ptr2 = head2;

        if (l1 > l2) {
            int diff = l1 - l2;
            while (diff-- > 0) ptr1 = ptr1.next;
        } else {
            int diff = l2 - l1;
            while (diff-- > 0) ptr2 = ptr2.next;
        }

        while (ptr1 != null && ptr2 != null) {
            if (ptr1 == ptr2) return ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return null;
    }

    private static int getLength(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Common Nodes
        Node common = new Node(15);
        common.next = new Node(30);

        // List 1: 3 -> 6 -> 9 -> 15 -> 30
        Node h1 = new Node(3);
        h1.next = new Node(6);
        h1.next.next = new Node(9);
        h1.next.next.next = common;

        // List 2: 10 -> 15 -> 30
        Node h2 = new Node(10);
        h2.next = common;

        Node result = findIntersection(h1, h2);
        if (result != null) System.out.println("Intersection: " + result.data);
    }
}
