package OOP.Polymorphism;

public class Branch extends ATM{


    public void loan(){
        System.out.println("Branch can give you up to 100K");
    }

    public void hire(){
        System.out.println("The branch can hire a Cashier");
    }

    public void assisstance(){
        System.out.println("Branch can help you with your account");
    }

}
