package Homework9;

import java.util.Scanner;

public class HW9T3 {
    public static void main(String[] args) {
        /*Create one int array with size of 10 without any value. Using scanner ask
        user to provide the int value until you filled out the array with given numbers.
                Then print the array with all numbers.
        Int [] numbers=new int[10];
        Example:
        Please enter the int number. You have 10 space in array:
        11
        Please enter the int number. You have 9 space in array:
        43
        Please enter the int number. You have 8 space in array:
        77
                keep continue to ask user until you don't have any space in the array.

         */

        Scanner scan = new Scanner(System.in);

        int numbers[]=new int[10];

        int count=10;

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Please enter the int number. You have "+count+"spaces left in the array:");
            numbers[i]=scan.nextInt();
            count--;
        }if(count>0){

        }else{
            System.out.println("There are no more spaces left in the array.");
        }



    }
}
