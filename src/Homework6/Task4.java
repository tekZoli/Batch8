package Homework6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your string: ");
        String input = scan.nextLine();

        if(input.substring(0,2).equalsIgnoreCase(input.substring(input.length()-2))){
            System.out.println(input.substring(2));
        }else if(input.length()<=2){
            System.out.println("");
        }else{
            System.out.println(input);
        }


    }

}
