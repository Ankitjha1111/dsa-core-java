import  java.util.HashSet;
public class HashSetEg3 {
    public static void main(String[] args) {
        HashSet<String> names =new HashSet<>();
        names.add("Ankit");
        names.add("Ankita");
        names.add("Harsh");
        names.add("Vikas");
        System.out.println("Size of:"+names.size());
        names.clear();
        System.out.println("After clear:"+names);

        names.isEmpty();
        System.out.println("Is Empty?:"+names.isEmpty());

    }
}
