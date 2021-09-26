package Homework6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your two strings: ");

        String first= scan.nextLine();
        String second = scan.nextLine();

        if(first.length()<=second.length()){
            //int firstLenght = first.length();
            String less = second.substring(0,first.length());
            System.out.println(first.concat(less));
        }else{
            //int secLenght= second.length();
            String less2 = first.substring(0,second.length());
            System.out.println(second.concat(less2));

        }




    }
}
