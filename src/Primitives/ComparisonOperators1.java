package Primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {

        //
        int x = 10;

        int y = 10;

        int z = 65;

        boolean result1 = x == y; // true

        System.out.println(result1);


        char  ch1 = 'A';
        char ch2 = 65;
        char ch3 = 66;

        boolean result2 = ch1 == ch2;
        System.out.println("result2 --> "+result2);

        boolean result3 = z == ch2;

        System.out.println("result3 --> "+result3);

        boolean result4 = z == ch3;

        boolean result = x>y;

        boolean r6 = x <= y;

        System.out.println(r6);

        boolean r7 = result1 == result2;

        // boolean r8 = result1 >= result2; does not compile beacuse it only compares number with true/false it can't

        boolean r8 = result1 != result2; // the only option I can do

    }
}
