package OOP.Inheritance3;

final public class TShirt extends Shirt{

    String COLOR;
    public TShirt(){
        super("M",25);
    }


    final public String info(){//cannot make it final, just overload
        return "This is info about T-shirt";
    }
    final public String info(Boolean clean){
        return "This is info about T-shirt";
    }//overloading
}
