package IfStatement;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {
        /*
        ask user to give me a number between 1 to 7
        -if user enters:
        1---> Monday
        2--> Tuesday
        .......
        7---> Sunday
        */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 to 7");

        int number = scanner.nextInt();

        if (number == 1) {

            System.out.println("It is Monday");
        }

        if (number == 2) {


            System.out.println("It is Tuesday");
        }

        if (number == 3) {

            System.out.println("it is Wednesday");

        }

        if (number == 4) {


            System.out.println("It is Thursday");
        }

        if (number == 5) {

            System.out.println("It is Friday");
        }

        if (number == 6) {


            System.out.println("It is Saturday");
        }

        if (number == 7) {

            System.out.println("It is Sunday");
        }





    }
}
