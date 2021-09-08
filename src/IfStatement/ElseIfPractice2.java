package IfStatement;

import java.util.Scanner;

public class ElseIfPractice2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the test scores between 0 to 100:");

        int score1 = scanner.nextInt(), score2 =scanner.nextInt(), score3 = scanner.nextInt();

        int average = (score1+score2+score3)/3;

      if(average>=90 && average<=100){
          System.out.println("Your average test score is "+average+" and letter grade is A");
      }else if(average>=80 && average<90){
          System.out.println("Your average test score is "+average+" and letter grade is B");
      }else if(average>=70 && average<80){
          System.out.println("Your average test score is "+average+" and letter grade is C");
      }else if(average>=60 && average<70){
          System.out.println("Your average test score is "+average+" and letter grade is D");
      }else{
            System.out.println("You need to take this test again");
        }













    }
}
