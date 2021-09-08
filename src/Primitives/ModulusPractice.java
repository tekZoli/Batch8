package Primitives;

public class ModulusPractice {

    public static void main(String[] args){

        // arithemetic op are +, -, *, /, %-modulus
        // % (modulus will give the remainder of division)

        int studentCount = 9;

        int divisor = 2;

        int resultOfDivision;

        resultOfDivision = studentCount/divisor;

        System.out.println("The result is --> " +resultOfDivision);

        int remainder= studentCount%divisor;

        System.out.println("The remainder is -->"+remainder);
        double remainder1 = studentCount % divisor;

        System.out.println(remainder);
        System.out.println(remainder1);

        // changing the number into 10.5 it will still give a remanider as 0.738434 or whatever

        int x= 15;

        int result = x % 6;
        // modulus finds the remainder

        System.out.println(result); //15/6 =2 --> Remanider = 3







    }


}
