package Homework6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = scan.nextLine();

        if(input.substring(0,1).contains("x")){
            System.out.println(input.substring(1));
        }else if(input.substring(1,2).contains("x")){
            String x= input.substring(0,1)+input.substring(2);
            System.out.println(x);
        }else{
            System.out.println(input);
        }
    }
}
