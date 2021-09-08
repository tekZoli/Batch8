package Project3;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println(" Please enter two words with spaces at the beginning and the end:");

        String words = scanner.nextLine();

        String words2 = words.substring(words.indexOf(" "),(words.length())).trim();

        System.out.println(words2);

        String wordB = words2.toUpperCase();

        System.out.println(wordB);

        char bee = wordB.charAt(0);

        System.out.println(bee);

        //String black = words2.replace(" ");





        //String wordC = wordB.substring(1);

        //System.out.println(wordC);


        //int bigCase = words.indexOf(" ");

        //System.out.println(bigCase);




    }
}
