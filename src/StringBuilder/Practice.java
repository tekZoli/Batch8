package StringBuilder;

import Array.Cat;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {


        String test = "Test";

        test = test.concat(" is coming with Selenium webdriver");

        test = test.substring(test.indexOf('S'));

        test = test.concat(" is a testing tool.");

        System.out.println(test);
        //==================================

       // StringBuilder build = "TEST"; --- will not compile
        StringBuilder builder = new StringBuilder("Test");

        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder();
        builder1.append("Test1");

        builder.append(" is coming with Selenium webdriver");

        System.out.println(builder);

        builder.append(true);
        builder.append(123);
        builder = builder.append("88888888888888888888888888");
        builder.append(" is cool");

        System.out.println(builder);

        //charAt
        System.out.println(builder.charAt(0));

        System.out.println(builder.indexOf("w"));

        System.out.println(builder.indexOf("J"));

        System.out.println("First 8 "+builder.indexOf("8"));

        System.out.println(builder.charAt((builder.length()-1)));

        System.out.println(builder.length()-1);

        System.out.println("Last 8 "+builder.lastIndexOf("8"));

        //length\
        //append
        //indexOf
        //lastIndexOf
        //charAt
        //replace

        builder.replace(45, 70, "*");
        System.out.println(builder);
        System.out.println(builder.replace(builder.indexOf("*"),(builder.indexOf("*")+1),"$$$$$$$$$$$$$$$$"));

        String sub = builder.substring(builder.indexOf("$"));
        //can't save it as stringbuilder
        System.out.println(sub);

        builder.append(sub);
        System.out.println(builder);
        System.out.println(builder.reverse());

        //reverse
        StringBuilder builder2 = new StringBuilder("Interview");
        builder2.reverse();
        System.out.println(builder2);
        builder2.reverse();
        //insert
        //delete
        //deleteCharAt

        builder2.insert(1,"$$$");
        System.out.println(builder2);
        int[] nums = {1,2,3};
        builder2.insert(builder2.indexOf("t"), Arrays.toString(nums));
        System.out.println(builder2);
        Cat cat = new Cat();
        builder2.insert(0, cat);
        System.out.println(builder2);

        builder2.delete(0,1);
        System.out.println(builder2);
        //object became a string because of override toString
        System.out.println(builder2.length());
        System.out.println(builder2.delete(34, 49));








    }
}