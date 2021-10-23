package RecapWithAhmet;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {


        //print each of the words and reverse them
//        String name = "I love Java";
//        String reverse="";
//        String[]split = new String[0];
//
//        for (int i = name.length()-1; i >=0 ; i--) {
//            reverse+=name.charAt(i);
//            for (int j = 0; j < reverse.length(); j++) {
//                split=reverse.split(" ");
//            }
//            //System.out.println(Arrays.toString(split));
//        }
//       System.out.println(Arrays.toString(split));

        String name = "Hello Java is so cool";

        String[] words = name.split(" ");

        System.out.println(Arrays.toString(words));


        for (int i = 0; i < words.length; i++) {
            String reverse = "";
            for (int k = words[i].length() - 1; k >= 0; k--) {
                reverse += words[i].charAt(k);

            }
            System.out.println(reverse.charAt(0));
            System.out.println(reverse.charAt(reverse.length() - 1));
            System.out.println(reverse);
        }
    }
}