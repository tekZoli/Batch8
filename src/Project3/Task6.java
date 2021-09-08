package Project3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 ingredients");

        String ingredients = input.nextLine();

        System.out.println("Please enter the int number:");

        int number = input.nextInt();

        String firstW = ingredients.substring(0, ingredients.indexOf(" "));

        String firstIngredient = ingredients.substring(0, ingredients.indexOf(" "));

        System.out.println(firstIngredient);

        String secondIngredient = ingredients.substring(ingredients.indexOf(" "), (ingredients.indexOf(" ")+1));

        System.out.println(secondIngredient);

        //System.out.println((number + firstIngredient.substring(1)));




       // String remainder = ingr.substring(ingr.indexOf(" ")).trim();


        //System.out.println(remainder);


       // System.out.println(firstW);
















    }
}
