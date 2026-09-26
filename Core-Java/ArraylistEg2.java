import java.util.ArrayList;
public class ArraylistEg2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(85);
        marks.add(75);

        //CONTAINS
        System.out.println("Contains 85?"+marks.contains(85));
        System.out.println("contains 60?"+ marks.contains(60));

        //IndexOf
        System.out.println("Index of 75:"+marks.indexOf(75));

        //Size
        System.out.println("Size of list:"+marks.size());
        //isEmpty
        System.out.println("Is list empty? "+marks.isEmpty());
    }
}
