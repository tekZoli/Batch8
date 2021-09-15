package IfStatement;


import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {



    /*
    -ask user to enter an int value
    -check and print if the number is even
    -otherwise print other number
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");

        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Your number is even");

        }else{
            System.out.println("Your number is not even");
        }





   /*
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a interger value");

    int a = input.nextInt();

    if (a % 2 == 0){
        System.out.println("Your number is even "+a);
    }
    else(){
        System.out.println("your number is a odd number "+a);
    }
    */


    }
}
