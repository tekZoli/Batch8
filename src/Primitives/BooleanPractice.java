package Primitives;

import javax.xml.bind.SchemaOutputResolver;

public class BooleanPractice {
    public static void main(String[] args){

        // booleans are yes/no questions, "flags" that can be raised, you can only give values of true or false

        boolean isLightOn = true;

        boolean isBreakTime; // I can just declare it

        isBreakTime=isLightOn;

        System.out.println(isLightOn);
        System.out.println(isBreakTime);

        int num=6;
        System.out.println(num);

        int num1=num;
        System.out.println(num1);

        boolean isClear=false;
        System.out.println(isClear);
        // System.out.println(isBreakTime+isClear);  it will not compile


        System.out.println("!!!!!!!"+isBreakTime+isClear);

        // True/False issue in java

        boolean bl = true; // work, yes, on, open
        boolean bl2 = false; // not working, off, no, closed

        int f1 = 5;
        int f2 = 5;
        int f3 = 10;

        // is i1 equals to i2, yes --> true  f1==i2 --> true
        // is f1 equals to f3? no--> false   f1==f3 --> false


       // boolean isi1EqualToi2= i1 == i2;











    }
}
