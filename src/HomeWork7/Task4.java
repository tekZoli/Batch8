package HomeWork7;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = scan.nextLine();
        int i =0;

        while(i<str.length()){

           str = str.replaceFirst(str.substring(i, i+1),"a");
            System.out.println(str);
            i++;
        }

    }
}
