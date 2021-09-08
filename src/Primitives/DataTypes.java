package Primitives;

public class DataTypes {
        public static void main(String[] args){
    /*
    there are 8 different primitive data types

    byte, short, int, long, float, double --> numbers
    char --> for single characters/letters
    boolean --> for true or false options
     */
            byte number = 6;
            byte number2 = 127;
            short number3 = 129;
            short number4 = 31789;

            // byte number2=129; for byte the range is -128 to 127.

            int number5 = 32_000; //you can use underscore (_) in between digits, every 3 zero especially

            int number6 = 1_000_000; // you can use underscore (_) in between digits, every 3 zero especially

                System.out.println(number6);

            long number7 = 341345; // it understands even if ut's shorter
            long number8 = 74_813_492_034_854L; // you should use "L/l" at the end of the values


            float number9 = 2.3f;
                // 2.3 decimal numbers
            // // you should use "f/F" at the end of the values

            float number10 = 56; // 56.0 --> 56
            System.out.println("Value of number10 --> "+number10); // it will show 56.0


            float number11 = 56.0F;

            double number12 = 2.1;  // 89 can be read as 89.0 too

            double number13 = 89;

            // most common primitive data type usages are int, double, long, boolean

            System.out.println(number13);

        }

}
