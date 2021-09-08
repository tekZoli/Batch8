package IfStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
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
        System.out.println("Do you know Java? Yes/No");
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("Great, do you know Selenium?");
            String selenium = scanner.next();

            if(selenium.equalsIgnoreCase("Yes")){
                System.out.println("Great, do you know API testing?");
                String api = scanner.next();

                if(api.equalsIgnoreCase("Yes")){
                    System.out.println("Do you have SQL knowledge?");
                    String sql = scanner.next();
                    if(sql.equalsIgnoreCase("Yes")){
                        System.out.println("Congrats, you are hired");
                    }else{
                        System.out.println("We need someone with SQL knowledge");
                    }
                }else{
                    System.out.println("We need someone who knows SQL");
                }
            }else{
                System.out.println("We need someone who knows API testing.");
            }

        }else{
            System.out.println("Please learn Java and come back");
        }

    }
}
