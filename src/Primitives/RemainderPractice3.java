package Primitives;

public class RemainderPractice3 {
    public static void main(String[] args) {

        // by using % operator
        // the phone is 875$ --- monthly payments, 100$ each month
        // print last months payment which is 75$

        int lastPayment = 875 % 100; // never store your numbers directly
                                        // it's hard coding, you need dynamic solution every time

        System.out.println("The last payment for the phone is "+lastPayment);


        int phonePrice = 875;

        int monthlyPayment = 100;

        int lastMonthPayment = phonePrice%monthlyPayment;

        System.out.println("$"+lastMonthPayment+" is your last month's payment");





    }
}
