package HomeWork7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter current and target speed");
        int current= scan.nextInt();
        int target = scan.nextInt();
        int count=0;

        while(current<target){
               current+= 10;
                count++;
        }
        System.out.println("The seconds to reach your target speed is "+count);



    }
}
