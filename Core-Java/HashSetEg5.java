import java.util.ArrayList;
import java.util.HashSet;
public class HashSetEg5 {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        set.add("Ankit");
        set.add("Amit");
        set.add("Ayush");
        set.add("Abhi");

        //Converting to arraylist

        ArrayList<String>names = new ArrayList<>(set);
        System.out.println("Converted ArrayList:"+names);

    }
}
