package RecapWithAhmet;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {


        //Split comes from String object
        //we are using split method to split the words from space
        //returns array

        String sentence = "Today is a beautiful day to recap java with you guys";

        String[] sent = sentence.split(" ");
        System.out.println(Arrays.toString(sent));
        //System.out.println(sent.length);
        //System.out.println(sent[]);


    }
}