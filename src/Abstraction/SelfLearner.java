package Abstraction;

public abstract class SelfLearner extends Student{


    public void attend(){
        System.out.println("Free attendance");
    }

    public void coffeeBreak(){
        System.out.println("It is alwayscoffe time ");
    }

    public abstract void nap();

}
