package HomeWork;

import java.text.DecimalFormat;

public class Task2 {

    public static void main(String[] args){

        double weightInKg = 70;
        double heightInMeters= 1.65;
        double bmi = weightInKg / (heightInMeters*heightInMeters);

        System.out.println("The BMI for this person is "+bmi);

        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println(format.format(bmi));



    }
}
