package Loops;

import java.util.Scanner;

public class ForLoopPractice1 {

    public static void main(String[] args) {

        /*
        get a positive int from user which is less than 10
        print out the number starting from that given number to 10, including 10
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive number that is less than 10 ");



        for( int  number= scanner.nextInt(); number<=10; number++ ){
            System.out.println("Your numbers "+number);
        }
    } ///main code is to do the printout !!!!!!!!!!
}
