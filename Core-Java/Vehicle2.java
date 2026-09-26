
interface Flyable{
    void fly();

}
class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird flies with wings");
    }
}
class Airplane extends Vehicle implements Flyable{
    @Override
    public void fly(){
        System.out.println("Airplane flies with engine");
    }
}
class Vehicle2{
    void start(){
        System.out.println("Vehicle started ");
    }

    public static void main(String[] args) {
        Flyable fly = new Bird();
        Vehicle2 ve = new Vehicle2();
        fly.fly();
        ve.start();
            }
        }
