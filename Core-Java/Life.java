public class Life {
    String type;
    int age;

    public Life(String type,int age){
        this.type=type;
        this.age=age;

    }
    void show(){
        System.out.println("His life:"  + type);
        System.out.println("His age:"  + age);
    }


public static void main(String[] args) {
    Life myLife= new Life("Boring",45);
    myLife.show();
}}