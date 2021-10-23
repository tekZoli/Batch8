package HomeWorkPractice;

import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {

//
//                String str = "Here we are at w3schools";
//                int cnt = 0;
//                char[] inp = str.toCharArray();
//                System.out.println("Duplicate Characters are:");
//                for (int i = 0; i < str.length(); i++) {
//                    for (int j = i + 1; j < str.length(); j++) {
//                        if (inp[i] == inp[j]) {
//                            System.out.println(inp[j]);
//                            cnt++;
//                            break;
//                        }
//                    }
//                }
//            }
//
//
//
//    }
//
//        String str = "Mary goes dancing";
//        char[] carray = str.toCharArray();
//        System.out.println("The string is: " + str);
//        System.out.print("Duplicate Characters in above string are: ");
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j < str.length(); j++) {
//                if (carray[i] == carray[j]) {
//                    System.out.print(carray[j] + " ");
//                    break;
//                }
//            }

        String str = "everybody talking loud";
        char[] array =str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(array[i]==array[j]){
                    System.out.println(array[j]);
                }

            }

        }






    }
}