package Loops;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        /*
        ask user to enter an intiger number
        find and print the numbers which can divide that given number

        input ==10 >>>>> 1,2,5,10
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int number = input.nextInt();

        int divider = 1;

        while(divider<=number){

            if (number % divider == 0){

                System.out.println("You will get the number that are yours are divisible by: "+divider);
            }
            divider++;
        }

    }
}
