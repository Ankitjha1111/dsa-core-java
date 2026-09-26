import java.util.ArrayList;

public class ArraylistEg4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");

        for (int i = 0; i < fruits.size(); i++) {


            //Iterate using index
            System.out.println("fruits[" + i + "] = " + fruits.get(i));
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }}
