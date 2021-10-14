package HomeWorkPractice;

import java.util.Arrays;

public class PracticeLargestNumber {
    public static void main(String[] args) {

        int[] numArray= {12,13,12,15,0, -1};

        Arrays.sort(numArray);
        System.out.println(numArray[numArray.length-2]);


        int[] array = {100, 300, 200, 450,350};

        int largest = array[0];

        int secondLargest = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>largest){
                secondLargest=largest;
                largest=array[i];

            }else if(array[i]>secondLargest && array[i]!=largest){
                secondLargest = array[i];
            }

        }
        System.out.println("The largest number is "+largest+" and the second largest is "+secondLargest);


    }
}
