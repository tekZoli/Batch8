package String;

import java.sql.SQLOutput;

public class StringBasics {
    public static void main(String[] args) {

        String text = "School";

        String name = new String("David");

        System.out.println(text);
        System.out.println();
        System.out.println(name);

        text = text+ " is Techtorial";

        System.out.println(text);

        text+=" Academy";

        System.out.println(text);

        // text -= "asasdasdasdas" --->  will not compile, the minus is not working here the plus stand in as and

        // Placing on String before the other String

        //and combining them toghether is called String concatenation

        String word = name+ text;

        System.out.println(word);
        System.out.println(word+" 5");
        System.out.println(word);

        name = name+ text;
        name += text;

        System.out.println(name);

        String str = "Java";

        String str1 = "Selenium";

        String result = str + " "+str1;

        System.out.println(result);
        System.out.println(str1+" is next");
        System.out.println(str+" is first");
        System.out.println(result + str + str1); // -----> Java SeleniumJavaSelenium

        str=str+5+6;

        System.out.println(str);

        str1 = str1 + "5" + "6";

        System.out.println(str1);

        result = 5+6+result;

        System.out.println(result); //before the strin in not cocking

        str = "Java";

        str = str + 5*6; // multiplication goes first so it's disregarding the plus sign


        System.out.println(str + 5 + 2 * 6);
        System.out.println(str);

        System.out.println(str+15/3);
        str = "Java";



        int a = 12;

        str.concat(" is cool");

        System.out.println(str);

        // you cannot change the value of the string without reassigning it

        str = str.concat(" Java is very easy");

        System.out.println(str);

        str = str.toUpperCase();

        System.out.println(str);

        // primitive datatypes do







    }


}
