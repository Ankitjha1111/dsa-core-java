public class UncheckedEg5 {
    public static void main(String[] args) {
        String str = "Ankit";
        try{
            System.out.println(str.charAt(12));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Caught : This is exception string index");
        }
    }
} // this is the code of string index out of bound exception
