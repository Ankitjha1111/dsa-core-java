class ListNode77 {
    int data;
    ListNode next;
    ListNode77(int d) {
        data = d;
        next = null;
    }
}

public class LinkedListUtils {

    public static String checkEvenOrOdd(ListNode head) {
        if (head == null) return "Empty List";

        ListNode fast = head;


        while (fast != null && fast.next != null) {
            fast = fast.next.next;
        }


        if (fast == null) {
            return "Even";
        }

        // Agar fast last node par ruk gaya, matlab odd
        return "Odd";
    }

    public static void main(String[] args) {
        // CASE 1: ODD List (3 Nodes: 10 -> 20 -> 30)
        ListNode oddList = new ListNode(10);
        oddList.next = new ListNode(20);
        oddList.next.next = new ListNode(30);

        // CASE 2: EVEN List (4 Nodes: 1 -> 2 -> 3 -> 4)
        ListNode evenList = new ListNode(1);
        evenList.next = new ListNode(2);
        evenList.next.next = new ListNode(3);
        evenList.next.next.next = new ListNode(4);

        // Printing results
        System.out.println("Odd List Result: " + checkEvenOrOdd(oddList));   // Output: Odd
        System.out.println("Even List Result: " + checkEvenOrOdd(evenList)); // Output: Even
    }
}
