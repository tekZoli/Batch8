package IfStatement;

public class DiscountTask {

    public static void main(String[] args) {

        /*
        -if your payment is 100 or more you will get %20 discount othervise you will get %5 discount
        -print out discounted total
         */

        int payment=200;

        if (payment>=100){

            System.out.println("You will get %20 off");
        }
        if (payment<=100){

            System.out.println("You will get %5 off");
        }

    }
}
