package IfStatement;

import java.util.Scanner;

public class CityNamePractice {

    public static void main(String[] args) {

        /*
        ask user for his/her cityname
        if the city name is chicago- ask user"what is the school name"
        if the school name is techtorial print "you are lucky to be in batch 10
        if the school name is not techtorial print--> "please come and visit is
        if the city name is not chicago --> "please come to chicago
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("What city are you from?");

        String city = scanner.nextLine();
        String cityName2 = scanner.nextLine();

        if (city.equalsIgnoreCase("Chicago")) {
            System.out.println("What is your school's name?");
            String schoolName= scanner.nextLine();
            if (schoolName.equalsIgnoreCase("Techtorial")){
                System.out.println("You are lucky to be in Batch10");

            }else{
                System.out.println("Please visit techtorial");
            }



        }else{
            System.out.println("Please visit Chi");
            }

        }

    }

