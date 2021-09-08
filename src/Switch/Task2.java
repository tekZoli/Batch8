package Switch;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        Ask user to provide his favorite color

        if it is blue --> print --> "My favorite color is blue, too"
        if it is red --> print --> "I also like color red"
        if it is green --> print --> "Green is more natural"
        if it is pink --> print --> "Most women like pink"
        if it is none of those --> print --> "There is no matching color"
        Collapse



                white_check_mark
        eyes
                raised_hands
        React
                Reply



        Send a message to classnotes
                */


    Scanner scanner = new Scanner(System.in);

        System.out.println("What is favorite color?");

        String answer = scanner.nextLine();

        switch(answer.toLowerCase()){

            case "blue":
                System.out.println("My favorite color is blue, too");

            case "red":
                System.out.println("I also like color red");
                break;

            case    "pink":
                System.out.println( "Most women like pink");
                break;
            case "natural" :
                System.out.println("Green is more natural");
                break;
            default:
                System.out.println("There is no matching color");

        }










    }
}
