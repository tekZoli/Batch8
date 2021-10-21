package HomeWorkCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class Task3 {

    /*
    Create one method takes one String array. This method needs to return
how many unique element you have in array.
Input: [“java”,“phython”,“javascript”,“c++”,“java”,“c++”]
Output: 4
     */

    public static void output(String[] array){
        TreeSet<String> newSet = new TreeSet<>();
        for (int i = 0; i < array.length; i++){
            newSet.add(array[i]);
        }
        System.out.println(newSet.size());
    }
    public static void main(String[] args) {

    String[] array = {"java","python","javascript","c++","java","c++"};

    output(array);

    }
}
