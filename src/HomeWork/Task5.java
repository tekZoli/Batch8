package HomeWork;

import java.text.DecimalFormat;

public class Task5 {

    public static void main(String[] args){

        double fahrenheit = 87;

        double celsius = (fahrenheit-32)*5/9;

        DecimalFormat format = new DecimalFormat("#.##");


        System.out.println(fahrenheit+" Fahrenheit = "+format.format(celsius)+" celcius");






    }
}
