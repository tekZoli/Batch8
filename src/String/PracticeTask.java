package String;

import java.util.Scanner;

public class PracticeTask {

    public static void main(String[] args) {

        /*
        TASK: get a string from User via scanner and:
-print:
	- first char
	- last char
	- index of second matching letter 'c'
	- lenght of string
	- index of x
         */

        Scanner bobby = new Scanner(System.in);

        String input = bobby.nextLine();

        char firstCh = input.charAt(0);

        char lastCh = input.charAt(input.length()-1);

        int secC = input.indexOf("c", input.indexOf(" ")+1);











        /*
      Scanner bobby = new Scanner(System.in);


        System.out.println("Users string name: ");
        String input = bobby.nextLine();


        char firstCh = input.charAt(0);
        char lastCh = input.charAt(input.length()-1);

        System.out.println("First and last chars: "+firstCh+" "+lastCh);


         */

       /* int match = input.indexOf("c", input.indexOf(" ")+1);

        System.out.println(match);

        int length = input.length();

        System.out.println(length);

        int x = input.indexOf('x');

        System.out.println(x);

        */











        /*

        char firstCh = input.charAt(0);
        char lastCh = input.charAt(input.length()-1);

        System.out.println("First and last chars: "+firstCh+" "+lastCh);

        int match = input.indexOf("c", input.indexOf(" ")+1);
        System.out.println(match);*/












       /* char firstCh = input.charAt(0);
        char lastCh = input.charAt(input.length()-1);

        System.out.println("First and last charachter: "+firstCh+" "+lastCh);

       // int secC =input.indexOf("c", input.indexOf("")+1);
        int secC= input.lastIndexOf(" ")-1;

        System.out.println(secC);

        int length = input.length();

        System.out.println(length);

        int indexX = input.indexOf('t');

        System.out.println(indexX);









        /*
        System.out.println("Users string name: ");

        String str = bobby.nextLine();
        System.out.println(str.charAt(0));
        System.out.println(str.charAt( str.length() -1));
        System.out.println(str.indexOf("c",str.indexOf("")+1));
        System.out.println(str.length());
        System.out.println(str.indexOf('x'));
        */









    }
}
