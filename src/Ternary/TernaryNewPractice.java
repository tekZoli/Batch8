package Ternary;

import java.util.Scanner;

public class TernaryNewPractice {

    public static void main(String[] args) {

        /*

        ask user for thier last name, if their last name starts with 'A' to 'K'
        --> concat the last name with  "most popular last name"
         othervise;
         --> concat the last name with well known last name

        */

         /*
    Task: solve following question by using ternary operator
       At the electronics shop there are two different brands of TV options for customers
        1 - Samsung TVs
        2 - Other TVs
       Ask customer: 'Which brand are you interested in?"
       based on their response:
       if they They said Samsung: Print --> "Samsung TV prices are starting from $1199"
                      otherwise : Print --> "Samsung TV prices are starting from $1199"
        */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your last name?");

        String lastName = input.nextLine().toUpperCase();

        String answer = lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'K' ? lastName + " Most Popular last name" : "Well known last name";
        System.out.println(answer);


    }
}
