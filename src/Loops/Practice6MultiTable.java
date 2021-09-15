package Loops;

import java.util.Scanner;

public class Practice6MultiTable {
    public static void main(String[] args) {
        /*
        ask user to give a number and create multiplication table from 1 to 10
        from that given number
        >>5*1
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        double number = input.nextDouble();

        double multiplier = 1;

        while(multiplier<=10){
            System.out.println(number +" * "+multiplier+ " = "+number * multiplier);
            multiplier++;
        }



    }
}
