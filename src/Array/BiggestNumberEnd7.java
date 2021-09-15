package Array;

import java.util.Arrays;

public class BiggestNumberEnd7 {
    public static void main(String[] args) {


        //create an array to store these numbers: 45,5,6,47,57,8,12,0,30
        //find the biggest number from this array

        int nums[]={45,5,6,47,57,8,12,30};
        int biggest=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]>biggest){
                biggest=nums[i];
            }System.out.println(biggest);

        }
        System.out.println(biggest);

        System.out.println(Arrays.toString(nums));

        //Arrays.sort(nums);-----------------------------
        //System.out.println(Arrays.toString(nums));------------------------------

        //print last element

        System.out.println(nums[nums.length-1]);

        //smallest number

        System.out.println(nums[0]);

        //write code to find the smallest number without sort method



        int smallest=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]<smallest){
                smallest=nums[i];
            }

        }
        System.out.println(smallest);











    }


}
