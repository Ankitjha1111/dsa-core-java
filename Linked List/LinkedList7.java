//remove the value at given position if position is less than 0 remove the value at position 0
class ListNode7 {
    public int data;
    public ListNode next;

    public ListNode7(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList7 {
    private ListNode head;
    private int length;

    public LinkedList7() {
        head = null;
        length = 0;
    }

    // --- Main Question Logic: Remove from Position ---
    public void remove(int position) {
        // Condition: Agar position < 0, toh 0 maan lo
        if (position < 0) {
            position = 0;
        }
        // Condition: Agar position >= length, toh aakhri node maan lo
        if (position >= length) {
            position = length - 1;
        }

        // Agar list khali hai
        if (head == null) {
            return;
        }

        // Case 1: Pehla node hatana (Head = Head.next)
        if (position == 0) {
            head = head.next;
        }
        // Case 2: Beech mein se ya end se hatana
        else {
            ListNode temp = head;
            // Hum us node tak jayenge jo delete hone wale se ek pehle hai
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            // Link ko jump karwana (Bypass logic)
            temp.next = temp.next.next;
        }
        length--; // Ek node kam ho gaya
    }

    // List mein value dhoondhna
    public int getPosition(int data) {
        ListNode temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.data == data) {
                return pos;
            }
            pos++;
            temp = temp.next;
        }
        return Integer.MIN_VALUE; // Agar nahi mila
    }

    // List ko print karne ke liye String mein badalna
    public String toString() {
        String result = "[";
        if (head == null) {
            return result + "]";
        }
        ListNode temp = head;
        while (temp != null) {
            result = result + temp.data + (temp.next != null ? ", " : "");
            temp = temp.next;
        }
        return result + "]";
    }

    // List ko puri tarah saaf karna
    public void clearList() {
        head = null;
        length = 0;
    }

    // Utility: Node add karne ke liye (Taki hum test kar saken)
    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    // Main Method Test karne ke liye
    public static void main(String[] args) {
        LinkedList7 ll = new LinkedList7();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        System.out.println("Original List: " + ll.toString());

        // Test position < 0 (Ye position 0 yaani 10 ko hatayega)
        ll.remove(-5);
        System.out.println("After remove(-5): " + ll.toString());

        // Test position in middle (Ab list [20, 30, 40] hai, pos 1 yaani 30 hatega)
        ll.remove(1);
        System.out.println("After remove(1): " + ll.toString());
    }
}
