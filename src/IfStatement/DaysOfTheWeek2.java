package IfStatement;

import java.util.Scanner;

public class DaysOfTheWeek2 {

    public static void main(String[] args) {
        /*
        ask user to enter first letter of the day and print:

        M----> It is Monday
        T----> It is Thurs or Tues.........
       */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first letter of the day you want to see");

        String letter = scanner.nextLine();

        if (letter.equalsIgnoreCase("M")) {
            System.out.println("It is Monday");
        }
        if (letter.equalsIgnoreCase("t")) {
            System.out.println("It is Thursday or Tuesday");
        }
        if (letter.equalsIgnoreCase("W")) {
            System.out.println("It is Wednesday");
        }
        if (letter.equalsIgnoreCase("F")) {
            System.out.println("It is Friday");
        }
        if (letter.equalsIgnoreCase("s")) {
            System.out.println("It is Sunday or Saturday");
        }

        else{
            System.out.println("Your entry is not valid, there is no day starting with char");
        }

    }
}
