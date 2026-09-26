public class Temperature {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }
    public double getFahrenheit(){
        return (celsius *9/5)+32;

    }
    public void setCelsius(double celsius){
        this.celsius=celsius;

    }

    public static void main(String[] args) {
        Temperature temp =new Temperature();
        temp.setCelsius(25);
        System.out.println("Fahrenheit"+temp.getFahrenheit());
    }}
