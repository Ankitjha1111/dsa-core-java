// how to insert a node at beginning of list
class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedList {
    private ListNode head;
    private int length;

    public LinkedList() {
        this.length = 0;
    }


    public synchronized void insertAtBegin(ListNode node) {
        node.next = head;
        head = node;
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
        LinkedList myList = new LinkedList();

        // 10 aur 20 insert karke check karte hain
        myList.insertAtBegin(new ListNode(10));
        myList.insertAtBegin(new ListNode(20));

        System.out.println("Linked List after insertion:");
        myList.display();
    }
}