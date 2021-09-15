package Homework8;

import java.util.Scanner;

public class HW8T4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first number");
        int firstNum = scan.nextInt();
        System.out.println("Please enter your second number");
        int secondNum = scan.nextInt();

        boolean prime;

        for (int i = firstNum; i <= secondNum; i++) {

            if (i == 1 || i == 0)
                continue;

            prime = true;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.println(i + " is a prime number ");
        }


    }
}
