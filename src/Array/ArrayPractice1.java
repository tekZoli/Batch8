package Array;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {


        int [] numbers = new int[5];
        System.out.println(numbers); // the result for this is called HASHCODE

        numbers[0]=11;
        System.out.println(numbers);
        System.out.println(numbers[0]); //--> 11
        System.out.println(numbers[1]); // --> 0

        numbers[1]=22;
        numbers[4]=44;
        System.out.println(numbers[4]); // -->44

       // System.out.println(Arrays.toString(numbers)); // --> it shows everything in the array

        //numbers[5]=55;// it will give Arrayindexoutofbounds since there no 5th index
        //System.out.println(numbers[5]);// it will give Arrayindexoutofbounds since there no 5th index
        System.out.println(Arrays.toString(numbers));// a method that comes from arrays

        System.out.println(numbers.length);


        for(int i=0; i< numbers.length; i++){

            System.out.println("from for loop "+numbers[i]);// integer arrays

        }



    }
}
