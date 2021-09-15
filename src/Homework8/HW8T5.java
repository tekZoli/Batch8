package Homework8;

import java.util.Scanner;

public class HW8T5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you numbers: ");
        String nums = scan.nextLine();
        String reverse = "";

        for (int i = nums.length() - 1; i >= 0; i--) {

            reverse += nums.charAt(i);

        }
        System.out.println("Here are your numbers in reverse: " + reverse);


    }
}
