public class MainPerson {
    public static void main(String[] args) {
        Person myperson = new Person("ankit",27);
        myperson.setName("Ankit");
        myperson.setAge(40);

        System.out.println("Tell my name:"+myperson.getName());
        System.out.println("Tell my age:"+myperson.getAge());
    }
}
