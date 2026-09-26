public class Student {
    private  final int id;
    public Student ( int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Student std = new Student(766767);
        System.out.println("Student ID:"+std.getId());
    }} // encapsulation (Read only-ID)



