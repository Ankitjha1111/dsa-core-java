// Remove a node matching the specified node from list

class ListNode6 {
    int data;
    ListNode next;

    public ListNode6(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList6 {
    ListNode head;

    public void removeMatched(ListNode node) {
        if (head == null || node == null) return;

        if (head == node) {
            head = head.next;
            return;
        }

        ListNode temp = head;
        while (temp.next != null && temp.next != node) {
            temp = temp.next;
        }

        if (temp.next == node) {
            temp.next = node.next;
        }
    }

    public void display() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList6 list = new LinkedList6();
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);

        list.head = n1;
        n1.next = n2;
        n2.next = n3;

        list.removeMatched(n2);
        list.display();
    }
}
