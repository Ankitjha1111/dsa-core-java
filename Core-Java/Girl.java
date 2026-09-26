public class Girl {
    private String type;
    private int age;

    public Girl( String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType(){
        return type;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }


public static void main(String[] args) {
        Girl ankita = new Girl("Romantic",22);
        ankita.setAge(95);
        ankita.setType("unromantic");
    System.out.println("Which type of girl she is :"+ ankita.getType());
    System.out.println("How much is her age:"+ankita.getAge());
}

}