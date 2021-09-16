package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringPracticeStoreNames3 {

    public static void main(String[] args) {
        /*
        ask user how many names they want to store
        -store those names in a string array
        -print out those names by using toString()
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many names you want to store: ");

        int size = scan.nextInt();
        scan.nextLine();

       String[] names = new String[size];
        //names[1]="Sorin";
        //names[2]="Bota";
        //names[3]="Lea";
        //names[4]="Ada";

        for(int i=0; i<size; i++) {

            System.out.println("Please enter a name: ");
            names[i]=scan.nextLine();

        } System.out.println(Arrays.toString(names));

    }
}
