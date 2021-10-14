package OOP.Inheritance3;

public class Mall {
    public static void main(String[] args) {

        Shirt shirt = new Shirt("L", 26);


        System.out.println(shirt.price);
        //shirt.COLOR="Red";--> you cannot reassign value for final variable

        TShirt tShirt = new TShirt();
        //tShirt.COLOR = "Black";-->you cannot reassign value
        tShirt.COLOR = "orange";
        System.out.println(tShirt.COLOR);

        TShirt tShirt1 = new TShirt();
        System.out.println(tShirt1.COLOR);

    }
}
