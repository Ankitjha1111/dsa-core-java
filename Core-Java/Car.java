public class Car {
    private String brand;
    private int model;

    public Car(String brand,int model){
        this.brand=brand;
        this.model=model;
    }
    public String getBrand() {
        return brand;
    }
    public int getModel() {
        return model;
    }
     public void setBrand(String brand){
        this.brand=brand;
     }

    public void setModel(int model) {
        this.model = model;
    }
}
