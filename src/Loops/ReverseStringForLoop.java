package Loops;

public class ReverseStringForLoop {
    public static void main(String[] args) {
        //selenium-- reverse it and print it as a new string
        //muineles
        //palindrome word ==> efe

        String str = "1234321";

        String reverse = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            reverse += str.charAt(index);
        }
        System.out.println(reverse);
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("It is a palindrom :");
        } else {
            System.out.println("The word is not a plaindrom");
        }


    }


}
