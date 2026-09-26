import  java.util.LinkedList;
public class LinkedListEg5 {
    public static void main(String[] args) {
        LinkedList<Integer>numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println("Numbers:"+numbers);
        System.out.println("Contains 200?"+numbers.contains(200));

        System.out.println("Index of 300:"+numbers.indexOf(300));

        System.out.println("Size:"+numbers.size());

        System.out.println("Is empty?"+numbers.isEmpty());

        numbers.clear();
        System.out.println("After clear ;"+numbers);
        System.out.println("is empty?:"+numbers.isEmpty());

        // this code: contains,indexOf,size,isEmpty,clear


    }
}
