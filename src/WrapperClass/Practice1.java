package WrapperClass;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Practice1 {

    public static void main(String[] args) {
        byte b1= 2;

        Byte bt1 = new Byte(b1);
        System.out.println(bt1);

        short s1 = 4;
        Short sh1= new Short(s1);

        Short sh2 = new Short((short)5);

        System.out.println(sh2);

        Integer i1 = new Integer(12);
        System.out.println(i1);

        long l1= 123;
        Long lg1 = new Long(l1);
        Long lg2 = new Long(123);
        System.out.println(lg1);

        Double db1 = new Double(3.5);
        System.out.println(db1);

        Float fl1 = new Float(2.5);
        System.out.println(fl1);

        Boolean bl1 = new Boolean(true);
        System.out.println(bl1==true);

        Boolean bl2 = new Boolean("True");

        System.out.println(bl2==true);


        Character ch1 = new Character('R');
        System.out.println(sh1);
        char c ='T';
        Character ch2 = new Character(c);
        Character ch3 = new Character('5');

        //Character ch4 = new Character(65); complile time error



        //AutoBoxing ---->

        Integer i2 = 25; //when you store primitives into the object type--- i2 is already an object
                            // comveeting pri mitive data to object type(WrapperClass)
        Boolean bl3 =true;//autoboxing

        ///Unboxing ----> converting or storing Wrapper class object or data

        int a = new Integer(11);

        char c1=ch1;//it was object now it is back to primitive

        double d2 = db1;

    }
}
