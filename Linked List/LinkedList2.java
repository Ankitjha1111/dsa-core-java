//How to insert a Node at end of Singly Linked list

class ListNode2 {
    int data;
    ListNode next;

    public ListNode2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList2 {
    private ListNode head;
    private int length;

    public LinkedList2() {
        this.head = null;
        this.length = 0;
    }

    public synchronized void insertAtBegin(ListNode node) {
        node.next = head;
        head = node;
        length++;
    }

    public synchronized void insertAtEnd(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        length++;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();

        list.insertAtBegin(new ListNode(10));
        list.insertAtEnd(new ListNode(20));
        list.insertAtEnd(new ListNode(30));
        list.insertAtBegin(new ListNode(5));

        System.out.println("Linked List Result:");
        list.display();
    }
}