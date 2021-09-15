package Homework8;

import java.util.Scanner;

public class HW8T1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series number");
        int series = scan.nextInt();
        int number = 1;
        int sum = 0;
        for (int i = 1; i <= series; i++) {
            System.out.print(number + "+");
            sum = sum + number;
            number = (number * 10) + 1;
        }
        System.out.println();
        System.out.println(sum);


    }
}
