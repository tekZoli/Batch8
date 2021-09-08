package IfStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CandidatesPractice {

    public static void main(String[] args) {

         /*
        ask from candidates if he or she knows java
        if yes--> if h/s knows selenium
        if yes--> if h/s knows api testing
        if yes--> if s/h knows SQL
        if yes >> "Congrats you are hired!!!"
        if no to java--> print"Please learn java and come back"
        if Selenium is no --> we need someone who has selenium knowledge
        if API testing no---> print we need someone who knows AAPI testing
        if SQL is no --> print we need someone who has SQL knowledge
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you know Java?");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Great, how about Selenium?");
            String selenium = scanner.nextLine();

            if (selenium.equalsIgnoreCase("yes")) {
                System.out.println("Do you know API?");
                String api = scanner.nextLine();

                if (api.equalsIgnoreCase("Yes")) {
                    System.out.println("Do you know SQL?");
                    String sql = scanner.nextLine();
                    if (sql.equalsIgnoreCase("Yes")) {
                        System.out.println("You are hired!!!");
                    }else {
                        System.out.println("Please learn SQL");

                }

                }else {
                    System.out.println("Please learn API");
            }
            }else {
                System.out.println("Please learn Selenium");

        }
        }else{
            System.out.println("Please learn Java");
        }
    }


}

