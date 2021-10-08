package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {

        //you are given an array of colors
        //find out and store duplicaTE elements into an arrayList from this array
        String [] colors = {"red", "black", "black", "red", "red", "orange"};

       List<String> list = Arrays.asList(colors);
        System.out.println(list);
        HashSet hashSet = new HashSet(list);

        HashSet hashSet1 = new HashSet(Arrays.asList(colors));
        System.out.println(hashSet);

        //find out and store duplicate elements into an ArrayList from this array

        ArrayList list2 = new ArrayList();
        HashSet set2 = new HashSet();

        for(String color : colors){
            if(!set2.add(color)){
               list2.add(color);
            }

        }
        System.out.println("*******"+list2);





    }
}
