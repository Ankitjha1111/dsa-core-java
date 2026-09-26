import java .util.HashSet;
public class HashSetEg4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Ankit");
        set.add("Shyam");
        set.add("Shyam");
        set.add("Ajit");
        set.add("Ankit");
        set.add("Rakesh");
        System.out.println("After adding duplicates:"+set);
    }  //After adding duplicates
}
