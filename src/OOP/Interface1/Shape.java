package OOP.Interface1;

public interface Shape {

    int SIDE=5;

    Number area(int side);

    Number perimeter();

    default void info(){
        System.out.println("I'm info about Shape interface");
    }



}
