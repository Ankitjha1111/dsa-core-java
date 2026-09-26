import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEg4 {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue:"+queue);
        System.out.println("Peek (front):"+queue.peek());

        queue.poll();//removes 10
        System.out.println("Queue after poll:"+queue);

    }
}
