package Homework8;

import java.util.Scanner;

public class HW8T7 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the the number");
        int num = scan.nextInt();
        int a = 1;

        for (int i = 1; i <= num; i++) {


            for (int j = 1; j <= i; j++) {


                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
