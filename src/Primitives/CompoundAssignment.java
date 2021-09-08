package Primitives;

public class CompoundAssignment {

    public static void main(String[] args) {

        int carNumber = 7;

        carNumber = carNumber + 5;

        System.out.println(carNumber);

        carNumber += 5;

        System.out.println(carNumber);

        carNumber /= 2; // divides than reassigns

        System.out.println("/= "+carNumber);

        int count;

        count = carNumber *2;

        System.out.println(count);

        int count1;

        // count1 += 10; // count1 has no value assigned, it will not compile, compile time error;

        count -= carNumber;

        System.out.println(count);

        int payment = 50;

        payment *= carNumber; // payment = payment * carNumber;

        System.out.println(payment);

        int modulus = 1000;

        modulus %= payment; // first java divides 1000 by 400 and finds the remainder and then assigns the value for modulus variable

        System.out.println(modulus);






    }
}
