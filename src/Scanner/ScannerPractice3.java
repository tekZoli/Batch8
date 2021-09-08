package Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name ");

        String fullName =  scanner.nextLine(); // if you change next to next line, it will show everything, if you have just next its just 1 word

        System.out.println(" you entered this value "+fullName);
        System.out.println("What is your state");
        char firstLetter = scanner.nextLine().charAt(0); // indexing, which is the position of the letters in the string
        // Illinois, letter count is 8
        // 01234567 ----> index numbers

        System.out.println(firstLetter);




    }
}
