public class Shape {
    void draw (){
        System.out.println("Drawing a shape...");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle..");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }}
