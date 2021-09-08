package Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // this is the creation of the scanner object
        System.out.println("Please enter your name");

        String name = input.nextLine(); //input.next();

        System.out.println("Your name is "+name);

        System.out.println("Please enter you last name ");

        String lastName = input.nextLine();

        System.out.println("Your full name is "+name+" "+lastName);

        // String c = "32134324324"; //it will take any value

        System.out.println("Please enter your age");

        int age = input.nextInt();

        System.out.println("Your age will be "+(age+10)+" in 10 years");

        int ageIn5Years = age+5;

        System.out.println("Your age will be "+ageIn5Years+" in the next 5 years");

        System.out.println("Please enter you city name "+ input.nextLine());
        name+= input.nextLine();
        System.out.println(name);


























    }
}
