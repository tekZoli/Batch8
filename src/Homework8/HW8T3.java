package Homework8;

import java.util.Scanner;

public class HW8T3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number: ");

        int number = scan.nextInt();

        int sum=0;
       int finish = number;
       int first;


       for( ;number>0; ){//153

           first=number%10;//3//5//1
           sum=sum+(first*first*first);//27//27+125//152+1
           number=number/10;//15//1//0

       }
           if(finish==sum){

               System.out.println("Your number is an armstrong number");
           }else{
               System.out.println("Your number is not a armstrong number");
           }


    }
}
