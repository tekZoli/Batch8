package Scanner;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName = "Fluffy";

        String lastName = "Brown";


        System.out.println(lastName);
        System.out.println("Please enter some string ");

        lastName = input.nextLine();

        System.out.println(lastName);

        String random = input.nextLine();
        System.out.println(random);
        String middleName;
        System.out.println("Please enter your middle name");

        middleName = input.nextLine();

        System.out.println(firstName+middleName+lastName);






    }
}
