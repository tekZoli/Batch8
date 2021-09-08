package String;

import java.util.Scanner;

public class FinalPractice {
    public static void main(String[] args) {






      Scanner input = new Scanner(System.in);

        System.out.println("Please write your name:");

        String name = input.nextLine();

        String index = name.substring(0, name.indexOf(" "));

        int index1 = index.length()-1;
        System.out.println(index1);

        int index2 = name.lastIndexOf(" ")-1;
        System.out.println(index2);

        int index3 = name.length()-1;
        System.out.println(index3);
















        /*

        String index1 = name.substring(0, name.indexOf(" "));

        int indexX = index1.length()-1;

        System.out.println(indexX);

        int indexXX = name.lastIndexOf(" ")-1;

        System.out.println(indexXX);
            */








/*
        String firstW = name.substring(0, name.indexOf(" "));
        int fistI = firstW.length()-1;

        System.out.println(fistI);

        int secI = name.lastIndexOf(" ")-1;

        System.out.println(secI);

        int thirdI = name.length()-1;

        System.out.println(thirdI);

*/










        /*
        String firstI = name.substring(0, name.indexOf(" "));
        System.out.println(firstI);

        int index1 = firstI.length()-1;
        System.out.println(index1);

        int secondI = name.lastIndexOf(" ")-1;
        System.out.println(secondI);

        int thirdI = name.length()-1;
        System.out.println();
        */






    }
}
