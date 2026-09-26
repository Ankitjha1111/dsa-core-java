 public class Person1 {
    String name;

    public Person1(String name) {
        this.name = name;

    }
}
class Employee1 extends Person1{
    int id ;
    Employee1(String name,int id ){
        super(name);
        this.id=id;
    }
} // Multilevel inheritance code
class Manager extends Employee1{
    String department;
    Manager ( String name ,int id, String department){
        super(name, id);
        this.department=department;
    }

    public static void main(String[] args) {
        Manager mgr = new Manager("Ankit jha",2234,"Tech lead");
        System.out.println(mgr.name + "  manages  " +  mgr.department);
    }}