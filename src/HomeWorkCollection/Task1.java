package HomeWorkCollection;

import java.sql.Array;
import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {
    /* Create one method takes one int array. This methods need to print
   all unique elements from array ascending order.
           Input: [2,3,4,4,7,2,1]
   Output: 1, 2, 3, 4, 7 */

    public static void uniqueElements(int[] array) {
        TreeSet<Integer> newSet = new TreeSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            newSet.add(array[i]);
        }
        Iterator<Integer> iterator = newSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
    }

    public static void main(String[] args) {

        int [] array= {2,3,4,4,7,2,1};
        uniqueElements(array);

    }
}
