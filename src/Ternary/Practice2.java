package Ternary;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

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

        Scanner input = new Scanner (System.in);

        System.out.println("Which brand are you interested in?");

        String answer = input.nextLine();

       String print = answer.equalsIgnoreCase("Samsung") ? "Samsung TV prices are starting from $1199"
                : "Samsung TV prices are starting from $1199";
        System.out.println(print);









    }
}
