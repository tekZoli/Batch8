package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1End4 {

    public static void main(String[] args) {
        /*
        ask user how many names they want to store
        -store those names in a string array
        -print out those names by using toString()
        -if the name has more than 5 letters save to an array a longNames
        -if the name has less than 5 letters save it to shorNames
        -print out those longNames and shortNames by using toString() method
         */

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many names you want to store: ");
        int size = scan.nextInt();

        String[] shortNames =new String[size];
        String[] longNames = new String[size];

        for(int i=0; i<size; i++){

            System.out.println("Please enter a name: ");
            String name = scan.next();
            if (name.length() >= 5){
                longNames[i] = name;
            } else {
                shortNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));

        */

        Scanner scan = new Scanner(System.in);
        System.out.println(" how many names do you want to store");
        int sizeArray = scan.nextInt();
// scan.nextLine();

        String longNames[] = new String[sizeArray];
        String shortNames[] = new String[sizeArray];


        for (int i = 0; i < sizeArray; i++) {

            System.out.println("Please enter a name");
            String names = scan.next();

            if (names.length() >= 5) {

                longNames[i] = names;

            } else {
                shortNames[i] = names;
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));

















    }
}
