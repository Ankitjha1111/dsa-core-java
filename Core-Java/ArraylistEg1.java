import java.util.ArrayList;
public class ArraylistEg1 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        //CREATE
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        // READ
        System.out.println("Cities:" + cities);
        System.out.println("First city:" + cities.get(0));

        //UPDATE
        cities.set(1, "Bihar");
        System.out.println("After update:"+cities);

        //DELETE
        cities.remove(2);
        System.out.println("After remove by index "+cities);

        cities.remove("Delhi");
        System.out.println("After remove by values :"+cities);








}   }