package Primitives;

public class Precendence {

    public static void main(String[] args) {

        int count = 10 + 15;
        int count1 = count + 3 * 5;

        System.out.println(count);
        System.out.println("count1 "+count1);

        int count2 = count - count1 / 2 * 3;

        System.out.println("count2 "+count2);

        int count3 = 6 / 3 * 5 % 3; //1

        System.out.println("count3 "+count3);

        int count4 = 6 - 4 - count + count3;

        System.out.println("count4"+count4);

        System.out.println("total of count3 and count4 "+ count3+count4);

        System.out.println("total of count3 and count4 "+ (count3+count4)); // taking another priority


        // 50& food, 50$ electronics, 80$ shoes
        //10%          20%            15%

        // totalTax = (50*0.10)  + (250*0.20)  +   (80*0.15)


        // total payment = 50 + 250 + 8-0 + (50*0.10)  + (250*0.20)  +   (80*0.15)

        // separate by paranthesis to tell java to do thse first


        double payment = 50 + 250 + 80 + (50*0.10)  + (250*0.20)  +(80*0.15);

        System.out.println(payment);

        double number = (20 *(.1 +500)* 2 +30) * .07; // paranthesis first
        System.out.println("number ---> "+ number);


    }
}
