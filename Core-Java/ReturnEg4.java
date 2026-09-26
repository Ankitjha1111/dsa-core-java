public class ReturnEg4 {
    public static String details(String name, int fee) {
        return "Name:" + name + " ,fee:" + fee;
    }

    public static void main(String[] args) {
        String det = details("Ankit", 20000);
        System.out.println(det);
    }
}