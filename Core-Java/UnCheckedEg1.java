public class UnCheckedEg1 {
    public static void main(String[] args) {
        int [] arr = {10, 20,30};
        try{
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught:Array index out of bounds!");
        }
    }
} // This is the code of arraay index out of bound exception
