package Project3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input1 = " Snicker    ";

        char snicker1 = input1.trim().toUpperCase().substring(0,3).charAt(2);

        System.out.println(snicker1);

        String input2 = "Cookie";

        boolean cookie1 = input2.toLowerCase().replace('o', 'u').concat("s").startsWith("c");

        System.out.println(cookie1);

    }
}
