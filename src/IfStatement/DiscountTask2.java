package IfStatement;

public class DiscountTask2 {

    public static void main(String[] args) {

        double payment = 80;

        if (payment >= 100) {
            payment -= payment * 0.2;

            System.out.println("You will get %20 off: " + payment);
        }

        else {
            payment -= payment*0.05;
            System.out.println("Your payment after %5 discount is: "+payment);
        }
    }
}