//Check whether the given linked list is null terminated or not . if there is cycle find the start node of loop


public class LinkedListCycleDetector {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node findCycleStart(Node head) {
        if (head == null || head.next == null) {
            return null;
        }


        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        LinkedListCycleDetector obj = new LinkedListCycleDetector();

        // Case 1: Cycle exists
        Node head = new Node(10);
        head.next = new Node(20);
        Node loopStart = new Node(30);
        head.next.next = loopStart;
        head.next.next.next = new Node(40);
        head.next.next.next.next = loopStart;

        Node result = obj.findCycleStart(head);

        if (result != null) {
            System.out.println("Cycle detected at node: " + result.data);
        } else {
            System.out.println("List is Null-terminated.");
        }
    }
}
