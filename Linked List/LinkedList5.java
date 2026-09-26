//deletion at end of linked list
class ListNode5 {
    int data;
    ListNode next;

    ListNode5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList5 {
    private ListNode head;

    // Method to add data (for testing)
    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Deletion at End
    public synchronized ListNode removeFromEnd() {
        if (head == null) {
            return null;
        }

        ListNode p = head, q = null, next = head.next;

        if (next == null) {
            head = null;
            return p;
        }

        while ((next = p.next) != null) {
            q = p;
            p = next;
        }

        q.next = null;
        return p;
    }

    // Method to display list
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList5 list = new LinkedList5();
        list.add(10);
        list.add(20);
        list.add(30);

        list.display();
        list.removeFromEnd();
        list.display();
    }
}