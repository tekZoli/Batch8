package OOP.Interface2;

import OOP.InheritanceTest.Car;

public class Duck extends Animal implements Flyable,CanSwim{

    public void fly(){
        System.out.println("Duck is flying");
    }

    public void eat(){
        System.out.println("Duck is eating");
    }

    public void sleep(){
        System.out.println("Duck is sleeping");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }
}
