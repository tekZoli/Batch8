package MentoringAhmet;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        //int[] array = {5,8,23,18,56,7,6,93,63,51,43,78,4,93}
        //find the even and odd number from the array and get the difference
        //-i have to iterate all number and for that use for loop
        int[] array = {5,8,23,18,56,7,6,93,63,51,43,78,4,93};
        int sumofEven=0;
        int sumOfOdd=0;


        for(int number : array){
            //i need to put condition for even orr odd nums
            if(number%2==0){
                System.out.println("This is an even number "+number);
                sumofEven+=number;
            }else {
                sumOfOdd+=number;

            }
        }




    }
}
