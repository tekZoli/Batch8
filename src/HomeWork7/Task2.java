package HomeWork7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your boundary numbers for the 3 and 5 divisions");
        int first= scan.nextInt();
        int second=scan.nextInt();
        int i=first;
        int count=0;

        while(i<=second){
            if(i%3==0 || i%5==0){
                System.out.println("Your results: "+i);
                count++;
            }i++;

        }
        System.out.println("The count of numbers found to be divisible by 3 and 5: "+count);



    }
}
