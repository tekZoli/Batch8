package Primitives;

public class RemainderPractice2 {
    static public void main(String[] args){

        // find the product of digits from a given number(multiply the digits)
        // print the result as following:
        // "The product is... "

        int number = 1234;

        int firstDigit = number%10; // first digit is one

        System.out.println(firstDigit);

        number = number/10; //this is my new number 111

        System.out.println(number);

        int secondDigit = number%10; // this is my second digit is 1

        System.out.println(secondDigit);


        number = number/10;  // my new number divided by 10
        System.out.println(number);

        int thirdDigit = number%10;

        System.out.println(thirdDigit);

        number = number/10; // this is my new number 11
        System.out.println(number);

        int fourthDigit = number%10;

        int product = firstDigit*secondDigit*thirdDigit*fourthDigit;

        System.out.println(fourthDigit);

        System.out.println("The product is " + (firstDigit*secondDigit*thirdDigit*fourthDigit));

        System.out.println("The product is " + firstDigit*secondDigit*thirdDigit*fourthDigit);

        System.out.println("The product is " + product);









    }
}
