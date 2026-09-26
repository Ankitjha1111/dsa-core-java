public class UnCheckedEg7 {
    public static void main(String[] args) {
        Object obj = new String("Ankit");
        try {
            Integer i = (Integer) obj;

        }catch (ClassCastException e){
            System.out.println("Caught: Wrong type cast!");
        }
    }
}// THIS IS CODE OF CLASS CAST EXCEPTION
