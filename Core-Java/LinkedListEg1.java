import java .util.LinkedList;
public class LinkedListEg1 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        //Create
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        //READ
        System.out.println("cities :" + cities);
        System.out.println("First city:"+ cities.get(0));

        //UPDATE
        cities.add("Chennai");
        System.out.println("After update:"+cities);
        //DELETE
        cities.remove(2);
        System.out.println("After removing:"+cities);
        cities.remove("Delhi");
        System.out.println("After removing by values: "+cities);
    }
}
