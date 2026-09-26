//return the length of list

// 1. Node Class
class ListNode9{
    public int data;
    public ListNode9 next;

    public ListNode9(int data) {
        this.data = data;
        this.next = null;
    }
}

// 2. Main Linked List Class
public class LinkedList9 {
    private ListNode9 head;
    private int length = 0;

    // --- Helper Method: Insert at End (Data bharne ke liye) ---
    public void insert(int data) {
        ListNode9 newNode = new ListNode9(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode9 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    // --- Q1: REMOVE METHOD ---
    public void remove(int position) {
        if (position < 0) position = 0;
        if (position >= length) position = length - 1;
        if (head == null) return;

        if (position == 0) {
            head = head.next;
        } else {
            ListNode9 temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        length--;
    }

    // --- Q2: TOSTRING METHOD (Display) ---
    public String toString() {
        String result = "[";
        if (head == null) return result + "]";
        result = result + head.data;
        ListNode9 temp = head.next;
        while (temp != null) {
            result = result + ", " + temp.data;
            temp = temp.next;
        }
        return result + "]";
    }

    // --- Q3: LENGTH METHOD ---
    public int length() {
        return length;
    }

    // --- Q4: GET POSITION METHOD (Search) ---
    public int getPosition(int data) {
        ListNode9 temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.data == data) {
                return pos;
            }
            pos += 1;
            temp = temp.next;
        }
        return Integer.MIN_VALUE;
    }

    // --- Q5: CLEAR LIST METHOD ---
    public void clearList() {
        head = null;
        length = 0;
    }

    // --- MAIN METHOD: Sout ke sath Testing ---
    public static void main(String[] args) {
        LinkedList9 list = new LinkedList9();

        // Data add kar rahe hain
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // 1. Check List and Length
        System.out.println("1. Initial List: " + list.toString());
        System.out.println("2. Current Length: " + list.length());

        // 2. Search for a value
        int searchVal = 30;
        int pos = list.getPosition(searchVal);
        System.out.println("3. Position of " + searchVal + " is: " + pos);

        // 3. Remove a node
        System.out.println("4. Removing node at position 1 (which is 20)...");
        list.remove(1);
        System.out.println("5. List after removal: " + list.toString());
        System.out.println("6. New Length: " + list.length());

        // 4. Clear everything
        list.clearList();
        System.out.println("7. After clearing the list: " + list.toString());
        System.out.println("8. Final Length: " + list.length());
    }
}
