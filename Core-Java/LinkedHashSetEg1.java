import  java.util.LinkedHashSet;
public class LinkedHashSetEg1 {
    public static void main(String[] args) {
        LinkedHashSet<String>set=new LinkedHashSet<>();
        set.add("ankit");
        set.add("vishal");
        set.add("karan");
        set.add("ankit");
        set.add("vishal");
        set.add("gaurav");
        System.out.println("LinkedHashset maintains insertion maintains insertion order:");
        System.out.println(set);
    }
}
