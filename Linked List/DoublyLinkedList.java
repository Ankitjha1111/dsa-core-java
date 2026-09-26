 class  Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

 class DoublyLinkedList {
    Node head;

    // 1. Insert at Head (Sabse Aage)
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        System.out.println("Inserted " + data + " at Head");
    }

    // 2. Insert at End (Sabse Peeche)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        System.out.println("Inserted " + data + " at End");
    }

    // 3. Insert After a Node (Jo tum diagram mein try kar rahe the)
    public void insertAfter(int targetData, int newData) {
        Node temp = head;
        // Pehle wo node dhundo jiske baad insert karna hai
        while (temp != null && temp.data != targetData) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node with data " + targetData + " not found!");
            return;
        }

        Node newNode = new Node(newData);

        // --- ASALI LOGIC (4 Pointers) ---
        newNode.next = temp.next; // 1. Naya node aage dekh raha hai
        newNode.prev = temp;      // 2. Naya node piche dekh raha hai
        temp.next = newNode;      // 3. Purana node ab naye ko dekh raha hai

        if (newNode.next != null) {
            newNode.next.prev = newNode; // 4. Agle node ko piche mod diya
        }
        System.out.println("Inserted " + newData + " after " + targetData);
    }

    // List dikhane ke liye
    public void display() {
        Node temp = head;
        System.out.print("Current List: null <- ");
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " <=> " : ""));
            temp = temp.next;
        }
        System.out.println(" -> null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(20);
        dll.insertAtHead(10);
        dll.insertAtEnd(30);
        dll.display();

        // Tumhare diagram wala case: 20 ke baad 25 insert karna
        dll.insertAfter(20, 25);
        dll.display();
    }
}
