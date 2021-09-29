package HomeWork7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of eggs you have in the box");
        int eggs= scan.nextInt();

        int count=0;

        while(eggs>0){
            System.out.println("How many eggs did you eat today?");
            eggs-= scan.nextInt();
            System.out.println("You have "+eggs+" eggs left");
            count++;
        }
        System.out.println("You don't have any eggs left");


    }
}
