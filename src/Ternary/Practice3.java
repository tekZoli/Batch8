package Ternary;

import java.util.Locale;
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        /*

        ask user for thier last name, if their last name starts with 'A' to 'K'
        --> concat the last name with  "most popular last name"
         othervise;
         --> concat the last name with well known last name

        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your last name?");

        String lastName = scanner.nextLine().toUpperCase();

        //String print = lastName.startsWith("A","B","C", "D", "E", "F", "G", "H", "I", "K") :

        String print =lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'K' ? lastName + " most popular last name"
                : lastName + " well known last name";

        System.out.println(print);
    }

}
