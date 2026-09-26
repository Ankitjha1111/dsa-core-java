//Circular Linked list insertion deletion traversal
class Node14 {
    int data;
    Node next;


    Node14(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    Node head = null;

    // 1. Insert at Head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // 2. Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            insertAtHead(data);
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // 3. Delete at Head
    public void deleteAtHead() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }

    // 4. Print List (Do-While)
    public void display() {
        if (head == null) {
            System.out.println("List Khali Hai!");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtHead(5);
        cll.display(); // Output: 5 -> 10 -> 20 -> (Back to Head)

        cll.deleteAtHead();
        cll.display(); // Output: 10 -> 20 -> (Back to Head)
    }
}
