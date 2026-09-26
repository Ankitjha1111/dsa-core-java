public class Device {
    void  powerOn(){
        System.out.println("Device Powered on ..");
    }
}
class Phone extends Device{
    void  call(){
        System.out.println("making a call");
    }
}  //Hierarchical inheritance
class Tablet extends Device{
    void code(){
        System.out.println("Writing a code ");
    }

    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.powerOn();
    }}