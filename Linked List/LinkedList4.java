//Deletion at the beginning of  linked list

class ListNode4 {
    int data;
    ListNode next;

    ListNode4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList4 {
    private ListNode head;


    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }


    public synchronized ListNode removeFromBegin() {
        ListNode node = head;
        if (node != null) {
            head = node.next;
            node.next = null;
        }
        return node;
    }


    public void display() {
        ListNode current = head;
        if (head == null) {
            System.out.println("List khali hai!");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList4 list = new LinkedList4();

        // Data insert kar rahe hain
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        System.out.println("Original List:");
        list.display(); // Output: 10 -> 20 -> 30 -> null

        ListNode removedNode = list.removeFromBegin();

        System.out.println("\nRemoved node: " + (removedNode != null ? removedNode.data : "None"));

        System.out.println("List removal ke baad:");
        list.display(); // Output: 20 -> 30 -> null
    }
}