package Array;

import java.util.Arrays;

public class SplitPractice14 {
    public static void main(String[] args) {


        String date = "12.03.2021";
        // check if the month is 12 and print out it is correct month
        // use \\

       String[] splitDate = date.split("\\.");

        System.out.println(Arrays.toString(splitDate));

        if(splitDate[0].equals("12")){
            System.out.println("It is correct month");
        }

        String date1 = "11/03/2021";

        String splitDate1[]= date1.split("/");
        System.out.println(Arrays.toString(splitDate1));

        String text = "My favorite color is \"blue\". \nHow about you?\t I'm good";//!!!!!!!!!!!!!!!!!!!!!!!!!
        // \r cuts whats before it
        System.out.println(text);





    }
}
