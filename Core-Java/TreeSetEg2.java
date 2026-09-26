import java.util.TreeSet;
public class TreeSetEg2 {
    public static void main(String[] args) {
        TreeSet<Integer>set =new TreeSet<>();
        set.add(345);
        set.add(650);
        set.add(765);
        set.add(65);
        set.add(367);
        set.add(789);
        System.out.println("TreeSet of integers(sorted):");
        System.out.println(set);
    }
}
