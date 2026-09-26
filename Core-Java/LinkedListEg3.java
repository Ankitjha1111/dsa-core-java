import  java.util.LinkedList;
public class LinkedListEg3 {
    public static void main(String[] args) {
        LinkedList<String>names= new LinkedList<>();
        names.add("ankit");
        names.add("ramesh");

        names.addFirst("Ravi");
        names.addLast("Shankar");
        System.out.println("Names after adding First and Last:"+names);

        names.removeFirst();
        names.removeLast();
        System.out.println("Names after removing first and last"+names);
    }
}        //This is the code of addFirst add last removeFirst,remove last in the topic Linked list of collection
