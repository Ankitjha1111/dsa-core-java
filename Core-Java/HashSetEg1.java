import  java.util.HashSet;
public class HashSetEg1 {
    public static void main(String[] args) {
        HashSet<String>names=new HashSet<>();

        //Create
        names.add("Ankit");
        names.add("Ajit");
        names.add("Charlie");
        System.out.println("Hashset:"+names);

        System.out.println("Contains Ankit?"+names.contains("Ankit"));
        System.out.println("Contains Ajit?:"+names.contains("Ajit"));

        names.remove("Ankit");
        System.out.println("After removing names:"+names);
        names.isEmpty();
        System.out.println("is Empty?:"+names.isEmpty());
    }
}
