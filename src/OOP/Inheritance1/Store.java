package OOP.Inheritance1;

public class Store {
    public static void main(String[] args) {

       Flower flower = new Flower("Lilly","Violet", 15);

        Rose rose = new Rose();

        System.out.println(flower.color);
        System.out.println(rose.color);

        Rose rose1 = new Rose("Pink");

        System.out.println(rose1.color);

        Tulip tulip = new Tulip();
        tulip.color="Green";

        System.out.println(tulip.color);

        Flower flower1 = new Flower();
        System.out.println(flower1.color);

        Tulip tulip1 = new Tulip();
        Tulip tulip2 = new Tulip("tulip3", "white",4.5);

        System.out.println(tulip2.name);

    }
}
