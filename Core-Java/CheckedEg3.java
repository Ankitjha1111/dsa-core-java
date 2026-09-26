public class CheckedEg3 {
    public static void main(String[] args) {
        try{
            System.out.println("Sleeping for 2 seconds ...");
            Thread.sleep(2000);
            System.out.println("Woke up");
        } catch (InterruptedException e){
            System.out.println("Thread was interrupted :"+e.getMessage());
        }
    }
}
