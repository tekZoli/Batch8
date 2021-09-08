package Scanner;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
        /*

        by using scanner
        ask user to provide their height and weight and calculate their bmi
        Formula--> BMI = weight / (height * height)
         */

        Scanner formula = new Scanner(System.in);

        System.out.println("Please provide your weight in kg");

        double weight = formula.nextDouble();

        System.out.println("Please provide your height in cm");

        double height = formula.nextDouble();

        double bmi = (int)(weight / (height*height)); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println("Your bmi is "+bmi);









    }
}
