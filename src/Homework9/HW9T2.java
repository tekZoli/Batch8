package Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class HW9T2 {

    public static void main(String[] args) {

        /*
        Using Scanner ask user to provide any string value and index number
from the array.
Using for loop update value from array.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String word=scan.nextLine();
        System.out.println("Please enter a index number: ");
        int index=scan.nextInt();
        String[] names= {"Liam", "Emma", "Noah", "Olivia", "William" };
        names[index]=word;


        for (int i = 0; i < names.length; i++) {



        }
        System.out.println(Arrays.toString(names));







    }
}
