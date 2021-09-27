package HomeWork7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you number for the multiplication table");
        int number = scan.nextInt();
        int count=0;

        while(count<=10){
            int multi=number*count;
            System.out.println("Your number "+number+" * "+count+" equals " +multi);
            count++;
        }



    }
}