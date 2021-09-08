package Primitives;

public class NumericPromotion {
    public static void main(String[] args) {


        byte b1 = 112;

        short sh1 = 30;

       // byte sum1  = b1 + sh1; no compilacion, because of the numeric promotion, java wants to see it as "int"

        int sum1 = b1 + sh1;  // java promotes smaller data types(byte, short) to "int" data type

        float fl1 = 2.3f;

        double db1 = 3.4;

        // float sum2 = fl1 + db1; // compile time error

        System.out.println(fl1+db1); // it will comile

        double sum2 = fl1 + db1;

        System.out.println(sum2);

        // int product1 = sum1 * sum2; no compi, result is a decimal number that's why you can't store it int data type

        double product1 = sum1 * sum2; // se puede asi

        int i1 = 23;

        double db2 = i1;

       //  int i2 = db2; cant put it into ze smoll one;

       // long l1 = db2; it's because of the data type






    }
}
