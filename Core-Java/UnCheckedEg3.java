public class UnCheckedEg3 {
    public static void main(String[] args) {
         String s = null;
        try {
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("hey u cant get length");
        }
    } // Hey this is th code of null pointer exception
}
