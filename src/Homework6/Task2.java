package Homework6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String input = scan.nextLine().toLowerCase();

        if(input.contains("r")&&input.contains("e")&& input.contains("d")){
            System.out.println("Your string contains red");
        }else if(input.contains("b")&&input.contains("l")&& input.contains("u")&&input.contains("e")){
            System.out.println("Your string contains blue");
        }else{
            System.out.println("Your string does not contain red or blue");
        }




    }


}
