import  java .util.HashSet;
public class HashSetEg2 {
    public static void main(String[] args) {
        HashSet<Integer>numbers=new HashSet<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println("Iterating HashSet:");

        for (Integer number:numbers){
            System.out.println(number);
        }
    }
}
