package Array;

import java.util.Arrays;

public class Practice2End5 {
    public static void main(String[] args) {
        int[] xyz=new int[7];
        int[] zipCodes = {123,321,456};

        String[] data ={"J","K"};

        System.out.println(zipCodes.length);
        System.out.println(zipCodes[0]);
        //System.out.println(zipCodes[5]);
        System.out.println(Arrays.toString(zipCodes));

        zipCodes[1]=999;

        System.out.println(Arrays.toString(zipCodes));

        Object[] objects ={"Red", "Blue", 55, 'A', 6.57, null, false};// subtopic,

        for(int i=0; i<objects.length; i++){

            System.out.println(objects[i]);
        }


        boolean[] conditions={true, false, false, false, true, 5==5, 5!=5};
        System.out.println(Arrays.toString(conditions));


        char[] charachters = {'A','$', '!', 'D', '7', 65};// its not 12 its the char
        System.out.println(Arrays.toString(charachters));

        int[] chars={'A'};
        System.out.println(Arrays.toString(chars));


    }
}
