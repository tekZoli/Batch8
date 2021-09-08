package String;

import java.util.Locale;

public class Methods3 {
    public static void main(String[] args) {

        String string = "Selenium";

        //.toUppercase();  --- it will not take parameters and will convert all string to uppercase

        string = string.toUpperCase();

        System.out.println(string);

        // .toLowerCase ----> it will convert all string to lowercase

        string.toLowerCase();

        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string);

        string = string.toLowerCase();
        String a = ""+string.charAt(0);
        a = a.toUpperCase();
        System.out.println(a);


        String word = "do whatever it takes";
        System.out.println(word.startsWith("do"));// ----> true

        System.out.println(word.startsWith("what"));  //----> false

        boolean result1= (word.startsWith("d")); //------->true

        System.out.println(result1);

        System.out.println(word.startsWith("d o"));  //-----> false

        word.startsWith("do w"); // -----------> true

        System.out.println(word.startsWith("Do")); //------> false

        System.out.println(word.startsWith("do whatever it takes"));  // -----> true

    // .endsWith();

        word.endsWith("do");// -----> false

        System.out.println(word.endsWith("es"));
        System.out.println(word.endsWith("s"));
        System.out.println(word.endsWith("takeS")); //----> false

    // .contains(); it will take string paramater and if the value is in the given string, it will return true if not, false
        System.out.println("88888888888888888");
        String  text = "Techtorial";
        text.contains("Tech");

        text.contains("ch"); // true

        text.contains("hc"); // false

        text.contains("t"); // true

        text = text+word;

        System.out.println(text.contains("do")); // true

       // System.out.println(text.contains("for");    //false

        System.out.println(text.contains("i")); //true

// .equals();-----> it will compare string values with each other if they are exactly in the same order or not

        String b = "John";

        String c = "John";
        // a.equals(b); ----> true
        // a.equals("John") ---> true

        String d = "JOHN"; //----> false


    }
}
