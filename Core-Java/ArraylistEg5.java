import java.util.ArrayList;
public class ArraylistEg5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);

        System.out.println("List before clear :"+numbers);
        System.out.println("Is empty?"+ numbers.isEmpty() );

        //CLEAR
        numbers.clear();
        System.out.println("Numbers after clear :"+numbers);
        System.out.println("Is empty now?"+numbers.isEmpty());
    }
}
