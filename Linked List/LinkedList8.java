//"Return a string representation of this collection"


class ListNode8 {
    public int data;
    public ListNode next;

    public ListNode8(int data) {
        this.data = data;
        this.next = null;
    }
}

// 2. Main Linked List Class
public class LinkedList8 {
    private ListNode head;
    private int length = 0;

    // --- Q1: Remove Method (The one we discussed) ---
    public void remove(int position) {
        // Boundary Checks
        if (position < 0) position = 0;
        if (position >= length) position = length - 1;

        if (head == null) return;

        // Action
        if (position == 0) {
            head = head.next;
        } else {
            ListNode temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        length--;
    }

    // --- Q2: toString Method (Print karne ke liye) ---
    public String toString() {
        String result = "[";
        if (head == null) return result + "]";

        ListNode temp = head;
        while (temp != null) {
            result = result + temp.data;
            temp = temp.next;
            if (temp != null) result = result + ", ";
        }
        return result + "]";
    }

    // --- Q3: getPosition Method (Search karne ke liye) ---
    public int getPosition(int data) {
        ListNode temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.data == data) return pos;
            temp = temp.next;
            pos++;
        }
        return Integer.MIN_VALUE;
    }

    // --- Q4: clearList Method (Sab delete karne ke liye) ---
    public void clearList() {
        head = null;
        length = 0;
    }

    // Extra: Add method taaki aap test kar saken
    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
        length++;
    }

    // Main Method: Run karke dekhne ke liye
    public static void main(String[] args) {
        LinkedList8 list = new LinkedList8();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Current List: " + list.toString()); // [10, 20, 30]

        list.remove(1); // Position 1 (20) ko hatayega
        System.out.println("After Remove(1): " + list.toString()); // [10, 30]
    }
}