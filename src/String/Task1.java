package String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string value, may have space in the beginning or the end:");

        String text = scanner.nextLine();

      text =   text.replace('a', '*');
        System.out.println(text);

        text= text.replace("e", "**");
        System.out.println(text);

        text=text.toUpperCase();
        System.out.println(text);

        int indexOfStar = text.indexOf('*');

        System.out.println(indexOfStar);
        System.out.println(indexOfStar*10);

    // find and print out middle char index nr

        //Chicago

        text.charAt(4);

        text.charAt((text.length()-1)/2);

       int index = text.indexOf(text.charAt((text.length()-1)/2));

        System.out.println(index);
    }
}
