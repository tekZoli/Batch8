package Constructor;

public class Car {


    String brand;

    public void move(){

        System.out.println("The car is moving");
    }



    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Car is going to garbage");
    }
}
