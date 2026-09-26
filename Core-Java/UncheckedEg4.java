public class UncheckedEg4 {
    public static void main(String[] args) {
        String str ="abc";
        try{
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("caught: Not a number");

        }  // This is code of Number format Exception
    }
}
