package Equals;

public class TestClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Nur");
        person2.setName("Nur");

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }
}


