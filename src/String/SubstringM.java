package String;

public class SubstringM {

    public static void main(String[] args) {

        String str = "Techtorial";
        //            0123456789
       String part1 = str.substring(2); //-----> chtorial--->

        System.out.println(part1); //when you pass a single index number into the substring method it will
        //take a partial text from that index and it will include that index's char

        String part2 = str.substring(2,4); //when you pass beginning and ending index numbers, it will start from beginning
        // index which is included and stops at ending index which is not included

        System.out.println(part2);

        System.out.println(str.substring(0)); // Techtorial

        // print la st 3 chars from "I will do it SOON"

        String string = "I will do it SOON";

        //string.length()-3;

       String st = string.substring(string.length()-3); //when your string value does not have enough value to take substring
        // it will throw an exception(string out of bound exp)

        System.out.println(st);








    }
}
