import  java.util.LinkedList;

public class LinkedListEg2 {
    public static void main(String[] args) {
        LinkedList<String>names =new LinkedList<>();
        names.add("Ankit");
        names.add("Abhi");
        names.add("Amit");     //code of iterate by index & for each
        names.add("Rajiv");
        //iterate using index
        System.out.println("Iterating using index: ");
        for (int i = 0; i <names.size() ; i++) {
            System.out.println("names["+i+"]= "+names.get(i));
            //using for-each
            System.out.println("Iterate using for each :");
            for (String name:names){
                System.out.println(name);
            }

        }
    }
}
