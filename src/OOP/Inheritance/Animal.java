package OOP.Inheritance;

public class Animal extends Object{

    String name = "Hippo";
    String color;
    String age;

    public int sleep() {
        System.out.println("Animal is sleeping");
        return 5;
    }

    public void eat() {
        System.out.println("Animal is eating");

    }
}