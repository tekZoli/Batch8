package OOP.Inheritance3;

public class Shirt {

    final String COLOR = "Blue";
    String size;
    double price;

    public Shirt(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public String info(){
        return "This is info about shirt";
    }
}
