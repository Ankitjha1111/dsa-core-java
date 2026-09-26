public class MainCar {
    public static void main(String[] args) {
        Car myCar= new Car("Maruti",2025);
        myCar.setBrand("Toyota");
        myCar.setModel(2021);
        System.out.println("The Brand of Car is:"+ myCar.getBrand());
        System.out.println("The model of Car is :"+myCar.getModel());
    }// This also the code of Encapsulation using getter setter class and object and constructor
}
