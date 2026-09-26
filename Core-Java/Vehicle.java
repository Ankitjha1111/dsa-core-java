public class Vehicle {
    private String type = "Generic vehicle";

    public void start(){
        System.out.println("The vehicle starts..");

    }
       public void stop(){
           System.out.println("the vehicle stops...");
       }
       public String getType() {
           return type;
       }

    public void setType(String type) {
        this.type = type;
    }
}
class Car1 extends Vehicle{
    private int gear=1;
    public void brake(){
        System.out.println("The Car has brake...");
    }
    public int getGear(){
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    @Override
    public void start(){
        System.out.println("the car has started smoothly");
    }

//Miscellaneous Oops code

public static void main(String[] args) {
        Car1 myCar = new Car1();
        myCar.start();
        myCar.stop();
        myCar.brake();
    System.out.println("Vehicle type:"+myCar.getType());
    System.out.println("Current gear:"+myCar.getGear());
    myCar.setGear(3);
    myCar.setType("SUV");
    System.out.println("New  gear:"+myCar.getGear());
    System.out.println("New type:"+myCar.getType());
}}


