package HomeWorkPractice;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        void rvereseArray(int[] arr) {
    start = 0
    end = arr.length - 1
    while (start < end) {
        // swap arr[start] and arr[end]
        int temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start = start + 1
        end = end - 1

         */

        int nums [] ={45,62,7,67,23,35,11};

        int firstN=0;
        int lastN=nums.length-1;

        while(firstN<lastN){
            int temp=nums[firstN];
            nums[firstN]=nums[lastN];
            nums[lastN]=temp;
            firstN=firstN+1;
            lastN=lastN-1;

        }
        System.out.println(Arrays.toString(nums));



    }
}
