package IfStatement;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {
        /*
        user will enter a number
        -if the number will fall in the range 0-->5: "Your number is between 0/5"
        -if the number will fall in the range 6-->10: "Your number is between 6/10"
        -if the number will fall in the range 11-->15: "Your number is between 11/15"
        -if the number will fall in the range 16-->20: "Your number is between 16/20"
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please pick a number between 0 to 20");

        int number = input.nextInt();


        if(number<=5 ){
            System.out.println("Your number is between 0 to 5");
        }else if( number>=6 && number<=10 ){
            System.out.println("your number is between 6 and 10");
        }else if( number>=11 && number<=15){
            System.out.println("Your number is between 11 and 15");
        }else{
            System.out.println("Your number doesn't fall into these categories");
        }












       /* int number = input.nextInt();

        if (number >= 0 && number <= 5) {
            System.out.println("Your number is between 0/5");
        } else if (number > 5 && number <= 10) {
            System.out.println("Your number is between 6/10");
        } else if (number >= 11 && number <= 15) {
            System.out.println("Your number is between 11/15");
        } else if (number > 15 && number <= 20) {
            System.out.println("Your number is between 16/20");
        } else {
            System.out.println("Your number does not fall into any range of 0 to 20");
        }

        */
    }
}
