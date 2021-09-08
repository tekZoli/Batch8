package Scanner;

import java.util.Scanner;

public class MoneyTransaction2 {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        double account = 200;

        System.out.println("How much do you want to deposit?");

        double fD = calc.nextDouble();
        account += fD;

        System.out.println("your current balance is: "+account);

        System.out.println("How much do you want to deposit?");

        double sD = calc.nextDouble();
        account +=sD;

        System.out.println("Your current balance is: "+account);

        System.out.println("How much do you want to deposit?");

        double tD = calc.nextDouble();

        account+=tD;

        System.out.println("Your current balance is: "+account);

        System.out.println("How much was the phone?");

        double pP = calc.nextDouble();

        account -=pP;

        System.out.println("Your current balance is: "+account);

        System.out.println("How much were the headphones?");

        double hP = calc.nextDouble();
        account-= hP;

        System.out.println("Your final balance is: "+account);











    }
}
