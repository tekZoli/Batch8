package HomeWork7;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your string");
        String test = scan.nextLine().toLowerCase();
        int i =0;

        while(i<test.length()){
            if(test.charAt(i)=='d'&& test.charAt(i+2)=='d'){
                System.out.println("dad");
            }i++;
        }
    }
}