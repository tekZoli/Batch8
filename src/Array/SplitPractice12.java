package Array;

import java.util.Arrays;

public class SplitPractice12 {

    public static void main(String[] args) {

        String str = "The fall is coming";

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        String[] words2 = str.split("a");

        System.out.println(Arrays.toString(words2));


    }
}
