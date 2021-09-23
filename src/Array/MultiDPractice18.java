package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDPractice18 {
    public static void main(String[] args) {


        int[]ids = {3,4,2,34,56,7};

        int[][] multiDem = {{60124,60125,60123},{9123,9124,9125},{5123,5124}};

       //multiDem[2][4]=5234; Arrauindexoutof bounds -- since there is no 4th index int throws an exeption
        System.out.println(Arrays.deepToString(multiDem));

        int[][] multiDem1 = new int[1][5];

        System.out.println(Arrays.deepToString(multiDem1));






    }

}
