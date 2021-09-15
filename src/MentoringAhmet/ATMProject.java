package MentoringAhmet;

/*

import java.util.Scanner;

public class ATMProject {

    public static void main(String[] args) {
/*
        //I am going to create a card number and password

        String saveddCardNumber="11";
        String savedPassword = "11";
        Scanner scan = new Scanner(System.in);
        int chances=3;
        int choice;
        int balance =100;
        int[] options = new int[]{5,10,20,50,10};
        int[] deposit = new int[]{5,10,20,50,100,200, 500,1000};
        String[] bills = new String[]{"Gas", "Electricitty","Internet","Water"};
        double[] cost=new double[]{10.33,20.99,40.99,15.99};

        do{
            System.out.println("Please enter your card number");
            String cardNumber =scan.next();
            System.out.println("Please enter your password");
            String password=scan.next();
            if(cardNumber.equals(saveddCardNumber)&&password.equals(savedPassword)){
                System.out.println("Welcome to BA");
                System.out.println("What would you like to do today");
                System.out.println("1-Withdraw\n2-Deposit\n3-Balance\n4-Payments\n5-Change password\n6-Exit");
                do{
                    System.out.println("What would you like to do today");
                    System.out.println("1-Withdraw\n2-Deposit\n3-Balance\n4-Payments\n5-Change password\n6-Exit");
                    choice=scan.nextInt();
                    switch(choice){
                        case 1:
                            for(int i =0; i<options.length; i++) {
                                System.out.println(options[i] + "$ ");
                                System.out.println("How much would you like to withdraw");
                                int money = scan.nextInt();
                                if (balance > money) {
                                    balance -= money;
                                    System.out.println("You succesfully withdrew the money!! Your new balance is " + balance + "$");
                                    break;
                                } else {
                                    System.out.println("You do not have enough balance");
                                    break;
                                }
                            }
                        case 2:
                            for(int i=0; i<deposit; i++) {
                                System.out.println(deposit[i]+"$");
                            }System.out.println("How much would you like to deposit");
                            int moneyDeposit=scan.nextInt();
                            balance+=deposit;
                            System.out.println("You succesfully deposited"+deposit+" and you new balance is"+balance);

                        case 3:
                            System.out.println("Your new balance is: "+balance);
                        case 4:
                            for(int i=0;i<bills.length;i++){
                                System.out.println(bills[i]+" = "+cost[i]);
                            }
                            System.out.println("What bill you would like to pay: ");
                            String option= scan.next();
                            for(int k=0; k<bills.length;k++){
                                if(option.equalsIgnoreCase(bills[k])){
                                    if(balance>cost[k]);
                                    System.out.println("You succesfully paid "+bills[k]+ "your new balance is: "+balance);
                                    break;
                                }else{
                                    System.out.println("You do not have enough money in you account");
                                }
                            }
                        case 5:
                        case 6:
                    }
                }while(true);

            }else{
                chances--;
                System.out.println("Wrong card number or password.Please try again. "+"You have"+chances+" left");

                if(chances==0){
                    System.out.println("Your card is on hold by the ATM.Please contact customer service");
                    break;
                }

            }




        }while(true);





    }
}
*/