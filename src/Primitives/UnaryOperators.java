package Primitives;

import java.sql.SQLOutput;

public class UnaryOperators {
    public static void main(String[] args) {

        int studentNumber = 25;

        studentNumber = studentNumber + 1;

        studentNumber +=1;

        studentNumber++;

        System.out.println(studentNumber);


        ++studentNumber;

        System.out.println(studentNumber);


        studentNumber--;

        System.out.println(studentNumber);

        --studentNumber;

        System.out.println(studentNumber);

       // =============================================
        studentNumber = 24;

        studentNumber++;
        studentNumber--;

        System.out.println(studentNumber++);  // 25 ---> it shows 24, but increases afterwards, actually student number is 25

        System.out.println(studentNumber); //shows 25

        System.out.println(++studentNumber); // it will show 26, because I  put is first;


        System.out.println(studentNumber--);  //show 26 and then decrese by 1
        studentNumber--; //24
        --studentNumber; //23
        System.out.println(--studentNumber); //decrease first 22, show 22
        System.out.println(studentNumber);

        int a = studentNumber++ + studentNumber++ + 5;
        a--;
        a = studentNumber;
        System.out.println(a--); //shows 24 but it's 23
        System.out.println(a);





    }
}
