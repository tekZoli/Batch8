package Homework8;

import java.util.Scanner;

public class HW8T1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int givenNumber = scanner.nextInt(), sum = 0, serialnumber = 1;

        for (int i = 0; i < givenNumber; i++) {

            System.out.print(serialnumber + "+");
            sum = serialnumber + sum;
            serialnumber = (serialnumber * 10) + 1;
        }
        System.out.println();
        System.out.println("The sum is: "+sum);
    }
}


