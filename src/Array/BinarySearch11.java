package Array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BinarySearch11 {
    public static void main(String[] args) {


        //Binary Search will return index number if the element is present in the array
        //if the element is not in the array it will return possible element position with negative sign in front of it
//you need to sort the array before you apply the binary search
        int[] stundentNumber = {100, 10, 15, 20, 30, 35};

        Arrays.sort(stundentNumber);

        System.out.println(Arrays.toString(stundentNumber));

        System.out.println(Arrays.binarySearch(stundentNumber, 35));

        System.out.println(Arrays.binarySearch(stundentNumber, 25));

        System.out.println(Arrays.binarySearch(stundentNumber, 150));//-7

        System.out.println(Arrays.binarySearch(stundentNumber, 49));//-6










        //String string ="Java";

        //System.out.println(string.indexOf('a'));//index number of first 1 ---> 1


    }
}
