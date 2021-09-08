package Primitives;

public class CastingPractice {

    public static void main(String[] args) {

     long l1 = 120;

    // int i1 = l1; larger data type cannot be stored in smaller data type

        int i2 = (int)l1; // this is called Explicit Casting or Auto Narrowing

        double db1 = l1;  // Implicit Casting or Auto Widening

        short apple = 800;
        short samsung = 600;

        short total = (short)(apple+samsung);


        System.out.println(total);

        byte total1 = (byte)(apple+samsung);

        System.out.println("total1 --->" +total1);


        int totalNumber2 = apple+samsung; // java is waiting for an int anyways

        double d1 = 2.3;
        int i = 12;
        //when you do compound assignments, you don't need to do explicit casting

        i += d1;

        System.out.println("i --> "+i);

        int i3;





    }
}
