//find the position of first value that is equal to given value

// 1. Node Class
class ListNode10 {
    public int data;
    public ListNode10 next;

    public ListNode10(int data) {
        this.data = data;
        this.next = null;
    }
}

// 2. Main Linked List Class
public class LinkedList10{
    private ListNode10 head;

    // --- YE RAHA GET POSITION KA CODE SOUT KE SAATH ---
    public int getPosition(int data) {
        ListNode10 temp = head;
        int pos = 0;

        System.out.println("\n--- Search Start ---");
        System.out.println("Target Value: " + data);

        while (temp != null) {
            // Har step ka status print karega
            System.out.println("Checking Position " + pos + " | Node Data: " + temp.data);

            if (temp.data == data) {
                System.out.println(">>> MATCH FOUND! Position: " + pos);
                System.out.println("--- Search End ---\n");
                return pos;
            }
            pos++;
            temp = temp.next;
        }

        System.out.println(">>> NOT FOUND: Value " + data + " list mein nahi hai.");
        System.out.println("--- Search End ---\n");
        return Integer.MIN_VALUE;
    }

    // --- MAIN METHOD: JO OUTPUT DIKHAYEGA ---
    public static void main(String[] args) {
        LinkedList10 list = new LinkedList10();

        // Testing ke liye data daal rahe hain
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // getPosition ko call kar rahe hain
        list.getPosition(30);  // Case 1: Jo list mein hai
        list.getPosition(100); // Case 2: Jo list mein nahi hai
    }

    // Insert method (Taaki test kar sako)
    public void insert(int data) {
        ListNode10 newNode = new ListNode10(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode10 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}