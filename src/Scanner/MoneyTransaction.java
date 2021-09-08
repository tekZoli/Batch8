package Scanner;

import java.util.Scanner;

public class MoneyTransaction {

    public static void main(String[] args) {

        /*
David wants to deposit his money into his bank account
-he already got $200 in his account
-he got three different paychecks ($480, $600 and $350)
-he can only deposit one paycheck at a time
-after he got all his money in the account
- he bought a phone for $599 and headphone for $299
- calculate his final money in his account
open a new class under scanner package and name it as "MoneyTransaction"
*/

        Scanner calc = new Scanner(System.in);

        double account = 200;

        System.out.println("How much do you want to deposit?");

       double firstDep = calc.nextDouble();
       account += firstDep;

       System.out.println("Your current balance is: "+account);

        System.out.println("How much do you want to deposit? ");

        double secDep = calc.nextDouble();
        account+=secDep;

        System.out.println("Your current balance is: "+account);

        System.out.println("How much do you want to deposit? ");
        double thirdDep = calc.nextDouble();
        account+=thirdDep;

        System.out.println("Your current balance is: "+account);

        System.out.println("What is the phone price? ");

        double phone = calc.nextDouble();
        account-= phone;

        System.out.println("What is the headphone price?");

        double headF = calc.nextDouble();
        account-= headF;

        System.out.println("Your current balance is: ");



















        System.out.println("How much do you want to deposit?" +firstDep+ " Now you have: ");

        double secondDep = calc.nextDouble()+account+firstDep;














    }
}
