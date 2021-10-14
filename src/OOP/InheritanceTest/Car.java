package OOP.InheritanceTest;

public class Car extends Vehicle{



    public Car(String model, int year, String brand, String model1) {
        super(model,year, brand);
        this.model = model1;
    }

    String model;
    String engineType;


    public static void drive(){
        System.out.println("Vehicle is moving");
    }

    @Override
    protected Object accelerate(){
        System.out.println(super.model);
        return new Integer(5);
    }

}
