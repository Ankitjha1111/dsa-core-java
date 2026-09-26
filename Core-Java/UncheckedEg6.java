public class UncheckedEg6 {
    public static void main(String[] args) {
        try {
            int [] arr = new int[-8];

        }catch (NegativeArraySizeException e){
            System.out.println( "Caught :this is exception of negetive Array size exception");
        }
    }
} // this the code of negetive array size exception
