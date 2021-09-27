package Homework6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your year to be checked it it's a leapyear: ");
        int year = scan.nextInt();
        int yearA=year % 4;
        int yearB= year % 100;
        int yearC = year % 400;


        if(yearA==0 && yearB!=0 || yearC==0){
            System.out.println("Your year "+year+" is a leap year");
        }else{
            System.out.println("Your year is not a leap year");
        }

    }
}
