package Primitives;

public class RemainderPractice {

    public static void main(String[] args){

        // 123 I want to find the sum/total of the digits from given number

        // 1+2+3 = 6 --> print "The sum of digits = 6"

        int number = 123;

        int firstDigit = number % 10; // 123/10 --> 12 remainder is 3

        System.out.println(" First digit or first remainder " +firstDigit);


        number = number/10;

        System.out.println(number);

        int secondDigit = number %10; // 12/10 --> 1 Remainder is 2

        System.out.println(secondDigit);

        number = number/10;

        int thirdDigit = number%10;

        System.out.println(thirdDigit);

        System.out.println("The sum of digits is = " +(firstDigit+secondDigit+thirdDigit));


    }
}
