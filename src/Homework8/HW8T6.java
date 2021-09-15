package Homework8;

import java.util.Scanner;

public class HW8T6 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your string to check if its a palindrome: ");

        String str = scan.nextLine();     //"cat"; //"iTopiNonAvevanoNipoti";

        String reverse ="";

        for(int index=str.length()-1;index>=0;index--){
            reverse+=str.charAt(index);
        }
        System.out.println("Here is your string in reverse: "+reverse);
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("Your string is a palindrome.");
        }else{
            System.out.println("Your string is not a palindrome");
        }


    }
}
