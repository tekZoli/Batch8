package Primitives;

public class ArithmeticOperators {

    public static void main(String[] args){

        // arithemetic op are +, -, *, /, %-modulus

        int a = 9;

        int b = a+5; // this is number of people

        int carCount = b*2; // if each person has 2 cars

        int finalCarCount = carCount-10;

        System.out.println(finalCarCount);

        int numberOfRows = finalCarCount/3;

        System.out.println("I need this many rows to park all the cars " +numberOfRows);

        double division = a/2;

        System.out.println(division);

        int division1 = a/2;

        System.out.println(division1);

        double division3 = a/2d;
        System.out.println(division3); //you have to specify that double is double
        // int division4 = a/2d(4.5); this will not compile, you cannot store double result into int data type
        // because "a" is "int" and division1 is double


    }
}
