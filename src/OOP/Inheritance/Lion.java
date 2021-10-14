package OOP.Inheritance;

public class Lion extends WildAnimal{


    public void eat(){
        System.out.println("Wild animal is eating");
    }
@Override
    public int sleep(){
        System.out.println("Wild animal is sleeping");
        return 5;
    }

    public Lion run () {
        System.out.println("Wild animal is runnig");
        return new Lion();
    }
    public void roar(){
        System.out.println("Lion is roaring");
    }


}
