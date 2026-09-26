public class UncheckedEg8 {
    public static void main(String[] args) {
        try {
            printAge(-3);

        } catch (IllegalArgumentException e) {
            System.out.println("caught" + e.getMessage());
        }
    }

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age can't be negative");

        }
        System.out.println("Age: " + age);
    }
}