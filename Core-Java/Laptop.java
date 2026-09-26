public class Laptop {
    String brand;
    double price ;
    int model;

    public Laptop(String brand,double price,int model) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }
        public void show(){
            System.out.println("Brand:"+brand);
            System.out.println("Price:"+price);
            System.out.println("Model:"+model);
        }




public static void main(String[] args) {
    Laptop mylap = new Laptop("HP", 60000.50, 2022) ;
     mylap.show();  // classes object constructor code

    }
}


