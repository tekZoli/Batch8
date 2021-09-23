package Homework9;

import java.util.Arrays;

public class HW9T4 {
    public static void main(String[] args) {

    int numbers[]={3,2,8,9,1,5,4,3,7,8,5,9,9};
        Arrays.sort(numbers);
        int firstNum= numbers[0];
        int bigNum=0;


        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>bigNum){
                bigNum=numbers[i];
                //System.out.println(bigNum);
                //System.out.println(bigNum-1);
                int secBig=bigNum-1;
                System.out.println(secBig);

            }

        }




    }
}
