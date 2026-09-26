import  java.util.LinkedHashSet;
public class LinkedHashSetEg2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer>numbers= new LinkedHashSet<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        System.out.println("Does it contains?:"+numbers.contains(200));
        //contains code of LinkedHashSet

        numbers.remove(200);
        System.out.println(" after removing 200:"+numbers);

        numbers.clear();
        System.out.println("After clearing;"+numbers);
    }
}
