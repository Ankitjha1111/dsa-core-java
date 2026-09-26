//Insert a NODE at  a specific position in a Singly Linked List

class Node3 {
    int data;
    Node next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList3 {
    Node head;
    int length = 0;

    // Insertion Logic
    public void insert(int data, int position) {
        if (position < 0) position = 0;
        if (position > length) position = length;

        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = head;
            for (int i = 0; i < position - 1; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
        length++;
    }

    // List ko print karne ke liye Sout yahan use hoga
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();

        list.insert(10, 0); // List: 10 -> null
        list.insert(20, 1); // List: 10 -> 20 -> null
        list.insert(15, 1); // List: 10 -> 15 -> 20 -> null (Position 1 par insert kiya)

        System.out.println("Current Linked List:");
        list.display(); // Output: 10 -> 15 -> 20 -> null
    }
}