package HomeWorkCollection;

import java.util.*;

public class Task2 {
    /*
    Create one method takes one int array. This methods needs to print all
unique element from array in descending order.
Input: [2,3,4,4,7,2,1]
Output: 7, 4, 3, 2, 1
     */

    public static void desending(int[] array){
        TreeSet<Integer> newSet= new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            newSet.add(array[i]);
        }
        Iterator iterator = newSet.descendingIterator();
        while(iterator.hasNext()){
           System.out.print(iterator.next()+",");
        }
    }

    public static void main(String[] args) {

     int[] array = {2,3,4,4,7,2,1};

        desending(array);
    }

}

