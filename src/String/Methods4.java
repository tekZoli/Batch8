package String;

import java.util.Locale;

public class Methods4 {
    public static void main(String[] args) {

// .equals();-----> it will compare string values with each other if they are exactly in the same order or not

        String a = "John";

        String b = "John";

        boolean bl1 =a.equals(b); //---> true
        // a.equals(b); ----> true
        // a.equals("John") ---> true
        boolean bl2 = a.equals("John");// ---->true


        String c = "JOHN"; //----> false

        boolean bl3 = a.equals(c);

        System.out.println(bl3);

// .equalsIgnoreCase();-----> //

       boolean bl25 = a.equalsIgnoreCase(c);  //true

        System.out.println(bl25);

        System.out.println("Java is ".equalsIgnoreCase("JAVA is ")); //true

        System.out.println("Java is cool ".equalsIgnoreCase("Java is "));

        String str1 = "Java is cool";

// .replace(); ----> it will replace original value with new one

        str1 = str1.replace('o','$');

        System.out.println(str1);

        str1 = str1.replace("c$$l", "easy");// doesn't replace by itself, needs to be reassigned

        String text1 = "Tava";

        str1.replace("Java", text1);
        System.out.println(text1);

        System.out.println(str1.replace("******", "?????"));

        String star = "Star of the day is *";

        System.out.println(star.replace("*", "$$$"));

// .trim(); --- the methdod that will remove the spaces at the beginning and at the end of the string

      String text2 = "    It is saturday     ";
        System.out.println(text2);
      text2 = text2.trim();
        System.out.println(text2);


        //"Do whatever it takes"
        //1. concat with "to learn Java"
        //2. make everything to uppercase
        //3. replace java with "JOB"
        //4. check if the text contains "Chicago"


        String text3 = "Do whatever it takes";

        text3 = text3.concat(" to learn Java");

        System.out.println(text3);

        text3=text3.toUpperCase();

        System.out.println(text3);

        text3=text3.replace("JAVA","JOB");

        System.out.println(text3);

        System.out.println("does is contain Chicago--->"+(text3.contains("Chicago")));

        System.out.println(text3);

/////////////////////////////////////////////

     /*   TASK: Ask user to enter a String value which should have space at the beginning or end
        - Replace all letter 'a's with single '*' and letter 'e's with double '**',
                - change all string value to UPPERCASE
                - Find index of First '*'
                - Multiply that value by 10 and
                - Print out the result

      */





    }
}
