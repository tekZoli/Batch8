package ArrayList;

import Constructor.Car;
import java.util.*;// pull everything

public class ArrayToArrayList {
    public static void main(String[] args) {

      Object[] objects = {2, true, "yes", "no", 2.5, new Car("toyoya")};

        // how to covert to arrayList


        List<Object> list = Arrays.asList(objects);
        System.out.println(list.size());
        //list.add("new element");
        System.out.println(list);//if you're changing an array to arraylist, the size will not change

        //list.remove("yes");//cannot change the size
        System.out.println(list);

        List<Object> list1 = Arrays.asList(1,2,3,4);
        System.out.println(list1);

        //list.add(5); cannot add again after values are set
        list1.set(0,100);
        System.out.println(list1);



    }
}
