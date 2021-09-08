package Project3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter string value");

        String words = scanner.nextLine();

        System.out.println("Please enter the starting number");

        String words2 = scanner.nextLine();

        String numbers = words.substring(1);

        System.out.println("Please enter the last number");

        String words3 = scanner.nextLine();

        String numbers2 = words.substring(5);

        String result = words.substring(1,5);

        System.out.println(result);













    }
}
