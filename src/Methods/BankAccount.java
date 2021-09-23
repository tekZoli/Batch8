package Methods;

public class BankAccount {

    String bankName="Techtorial";
    int accountNumber;
    double balance;
    String accountHolderName;
    boolean loggedIn;
    String userName;
    String password;


    //create a method that will display all of the account info
    //create a method named as deposit, it will update the balance
    //create a method named as withDraw, it will update the balance
    //create a method named as logIn, it will check if the user logged in or not, return true or false

    public void accountInfo(){
        //accountNumber=334354;
        System.out.println("Bank name: "+bankName+"\n Account number is: "+ accountNumber+"\nBalance is: "
                +balance+"\n Account holder's name is: "+accountHolderName+"\nLogged in: "+loggedIn);

    }

    public double deposit(double depositAmount){

     balance+=depositAmount;
        System.out.println("Your new balance after the deposit amount of: "+depositAmount+ " is "+balance);
        return balance;
    }

    public double withDraw(double withdrawAmount){
        balance-=withdrawAmount;
        System.out.println("Your new balance after the withdrawal : "+withdrawAmount+ " is "+balance);
        return balance;
    }

    public boolean logIn(String user, String pass){
        if(userName.equals(user) && password.equals(pass)){
            loggedIn=true;
            System.out.println("You successfully logged in");
        }else{
            System.out.println("Your credentials are not matching. Try again");
        }
        return loggedIn;
    }

    public static void main(String[] args) {
        BankAccount java=new BankAccount();
        java.accountInfo();
        java.accountNumber=12345;
        java.accountHolderName="Joe";
        java.userName="abc";
        java.password="123";
        java.balance=100_000;
        java.accountInfo();
        java.deposit(5000);
        java.withDraw(60);
        java.logIn("abc", "123");
        java.accountInfo();
    }

}
