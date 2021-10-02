package Homework12;

import java.util.Scanner;

public class TestTime {
    public static void main(String[] args) {
        System.out.println("Hi use welcome to our app!");
        Time time=new Time(3,3,3);
        Time date=new Time(3,4);
        Time dataTime=new Time(2,2,2,2,2);

        time.instrutions();
        System.out.println("Enter your choice: ");
        Scanner scan = new Scanner(System.in);
        int userInput=scan.nextInt();

        System.out.println("Enter what you want to do: ");
        switch (userInput) {
            //all the methods you created you will call them here
            case 1:
                time.getTime(6);
                break;
            case 2:

                time=new Time(4,5);
                break;
            case 3:
                time=new Time(3,4,5,56,6);
                break;
            case 4:
                time=time;
                break;
            case 5:
                time=time;
                break;
            case 6:
                time=time;
                break;
            case 7:
                time=time;
                break;
            case 8:
                time=time;
                break;


        }


    }
}
