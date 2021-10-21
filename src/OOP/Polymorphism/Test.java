package OOP.Polymorphism;

public class Test {
    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.balance();

        //Branch branch = (Branch) atm;

        //branch.loan();

        ATM branch1 = new Branch();//the left side is deciding where are the things coming from
                                    //right is what type of object is

        branch1.deposit();
        //branch1.loan();

        Branch branch2 = new Branch();
        branch2.hire();

        Bank bank = new Bank();

        bank.withDraw();

        ATM atm1 = new Bank();
        atm1.balance();

        ((Branch)atm1).hire();

        ((Bank)atm1).hire();//downcasting the object to the child reference

        ATM atm2=new Branch();

        ((Branch)atm2).hire();
        //((Bank)atm2).hire(); -doesn't work because of no relation

        Bank bank1 = new Bank();

        bank1.hire();// calls from bank because it's the closest one






    }
}
