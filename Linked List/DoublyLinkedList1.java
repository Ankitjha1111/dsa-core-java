// Deletion of Doubly linked list
class Node12 {
    int data;
    Node next;
    Node prev;

    // Constructer
    Node12(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Main DLL Class
public class DoublyLinkedList1 {
    Node head;

    // --- DELETE AT HEAD ---
    public void deleteAtHead() {
        if (head == null) {
            System.out.println(" List khali hai!");
            return;
        }

        
        head = head.next;

        if (head != null) {
            head.prev = null; 
        }
        System.out.println(" deleted at head sucessfully!.");
    }

    // --- DELETE AT END ---
    public void deleteAtEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        
        while (temp.next != null) {
            temp = temp.next;
        }

        
        temp.prev.next = null;
        System.out.println("Sout: deleted at end sucessfully!.");
    }

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display function
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList1 dll = new DoublyLinkedList1();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);

        System.out.println("Pehle:");
        dll.display();

        dll.deleteAtEnd(); 
        dll.deleteAtHead(); 


        dll.display();
    }
}
