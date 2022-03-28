public class Person {

    private int gender = -1;

    public Person(int gender) {
        this.gender = gender;
    }

    public void speak() {
        if (gender == 1) {
            System.out.println("I'm a man");
        } else if (gender == 2) {
            System.out.println("I'm a woman");
        }
    }

    public static void main(String[] args) {
        System.out.println("I'm a man");
        Person woman = new Person(2);
        woman.speak();
    }

}