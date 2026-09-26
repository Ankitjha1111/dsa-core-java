public class Employee {
    public double salary;

    protected double getSalary(){
        return salary;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Salary:"+emp.getSalary());
    }} //protected access code of Encapsulation
