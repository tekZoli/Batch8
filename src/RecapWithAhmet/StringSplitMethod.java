package RecapWithAhmet;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {


        //Split method comes from String object
        // The main reason people are using split
        //method to split the words from the space




            String sentence = "Today is beautiful day to recap" +
                    "java with you guys";

            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i].length() + ",");
            }
//        System.out.println(Arrays.toString(words));
//        System.out.println(words[0].length());
        }


    }
