package OOP.Interface2;

public class Test {
    public static void main(String[] args) {
       //Flyable flyable = new Flyable();
        Bird bird =  new Bird();
        Dolphin dolphin = new Dolphin();
        Duck duck = new Duck();

        Flyable flyable=new Bird();
        Flyable flyable1 = new Duck();

        CanSwim canSwim = new Dolphin();
        CanSwim canSwim1 = new Dolphin();

        //CanSwim canSwim2 = new Bird(); no relation


    }
}
