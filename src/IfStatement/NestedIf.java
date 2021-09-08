package IfStatement;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        /*
        if (condition){

            if(condition2){

                if(condition3){

                    sout(HELLO);

                }else{
                }else{
                }
               }
               }
        else{
        }
      */

        //==================================================================================

        /*
        ask user for his/her cityname
        if the city name is chicago- ask user"what is the school name"
        if the school name is techtorial print "you are lucky to be in batch 10
        if the school name is not techtorial print--> "please come and visit is
        if the city name is not chicago --> "please come to chicago
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What city are you from?");
        String cityName= scanner.nextLine();
        String cityname2 = scanner.nextLine();

        if(cityName.equalsIgnoreCase("Chicago")){

            System.out.println("What is your school name?");

            String schoolName = scanner.nextLine();
            if(schoolName.equalsIgnoreCase("You're one of the heroes")){

            }else{
                System.out.println("Please visit Techtorial");
            }
        }else{
            System.out.println("Please come to Chiacgo");

        }

    }
}
