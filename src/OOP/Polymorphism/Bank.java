package OOP.Polymorphism;

public class Bank extends Branch {

    @Override
    public void loan() {
        System.out.println("The bank can give up to a loan up to 1M");//changed the ability of the child, child is more capable
    }

    public void hire(){
        System.out.println("The bank can hire a CEO");
    }

    public void openAccount(){
        System.out.println("A bank can open a business account");
    }
}
