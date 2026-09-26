import java.util.ArrayList;
import java.util.Collections;
public class ArraylistEg3 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ankit");
        names.add("John");
        names.add("Bob");
        names.add("Alice");
        System.out.println("Original list:" + names);

        //Sort
        Collections.sort(names);
        System.out.println("Sorted list:" + names);
        //REVERSE
        Collections.reverse(names);
        System.out.println("Reversed list:"+names);

    }
}
