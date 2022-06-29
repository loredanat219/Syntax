package ternary;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void isAdultOrChild() {
        System.out.println(this.age >= 18 ? "Adult" : "Child");
    }

    public static void main(String[] args) {
        Person child = new Person(7);
        child.isAdultOrChild();

        Person adult = new Person(42);
        adult.isAdultOrChild();
    }
}
