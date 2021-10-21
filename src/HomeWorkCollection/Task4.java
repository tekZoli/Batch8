package HomeWorkCollection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Task4 {
    /*
    Create one method takes one String Array and needs to return
ArrayList with unique elements with ascending from String Array.
Input: [“java”,“phython”,“javascript”,“c++”,“java”,“c++”]
Output: [“c++”,“java”,“javascript”,“phython”]
     */

    public static void ascArray(String[] array) {
        TreeSet<String> newSet = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
           newSet.add(array[i]);
        }
        ArrayList<String> newAr = new ArrayList<>();
        newAr.addAll(newSet);
        System.out.println(newAr);
    }





    public static void main(String[] args) {

    String[] array = {"java","phython","javascript","c++","java","c++"};

    ascArray(array);

    }
}
