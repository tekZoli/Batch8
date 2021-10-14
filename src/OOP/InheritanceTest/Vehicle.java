package OOP.InheritanceTest;

public class Vehicle {

   /* ==================TASK===================
            -Vehicle
    Variables:
    protected  model;
    default year;
    public brand;
    Methods:
    drive(); --> vehicle is moving
    stop(); --> return true, vehicle is stopping
    protected start(); --> return true, vehicle is starting
    default accelerate(); --> return Object
    Constructor: create a constructor to initiliaze instance variables
-Car
  *extends Vehicle
    variables:
    model;
    engineType;
    Methods:
    Override drive(); --> Car is moving
    Override accelerate(); --> return Integer and calls model from parent class
    Collapse

    */

    protected String model;
    final int year =2021;
    public String brand;

    public  Vehicle(String model, int year, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public static void drive(){
        System.out.println("Vehicle is moving");
    }

    public boolean stop(){
        System.out.println("Vehicle is stopping");
        return true;
    }

    final protected Boolean start(){
        System.out.println("Vehilce is starting");
        return true;
    }

  Object accelerate(){
        return new Object();
    }
}
