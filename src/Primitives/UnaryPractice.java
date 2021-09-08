package Primitives;

public class UnaryPractice {
    public static void main(String[] args) {

        // DD buy 12 get 1$ off next time

        // KK buy 12 and pay 11$ now

        int dd = 12;

        int kk = 12;

        System.out.println("Payment for DD "+ dd--); //now we pay 12 but latah we peeeeyyy 11

        System.out.println("Payment for DD " +--kk);

        // kk -=5; it's going to be 5 less

        System.out.println("DD, I am back "+ dd);

        System.out.println("KK I am back "+ kk);


    }
}
