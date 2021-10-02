package ArrayList;

import Constructor.Car;

import java.util.ArrayList;


public class Practice1 {
    public static void main(String[] args) {

       // object is default

        ArrayList list1 = new ArrayList();

        ArrayList list2 = new ArrayList(3);

        ArrayList list3 = new ArrayList(list1);

        ArrayList <Integer> list4 = new ArrayList();

        ArrayList <Double> list5 = new ArrayList<Double>(); // we can also leave them empty

        ArrayList <Car> list = new ArrayList();

        System.out.println(list2);

        //list2[0] = 12; --- problem

        //add

        list2.add(11);
        list2.add("colors");
        System.out.println(list2);
        list2.add(22);
        System.out.println(list2);
        list2.add(33);
        System.out.println(list2);//[11, colors, 22, 33]
        list2.add(2,44); //[11, colors, 44, 22, 33]
        System.out.println(list2);

        list1.add(0,99);
        System.out.println(list1);

        //size

        int list2Size = list2.size();
        System.out.println(list2Size);

        list2.add(5, 66);
        System.out.println(list2);


        //list2.add(8, 88); //--index out of bound exeptions because it does not exist yet
        // and is not the next index after the end

        //get()

        System.out.println(list2.get(3));
        //System.out.println(list2.get(10)); -- index out of bound exeption, index does not exist


        //remove()

        list2.remove("white");
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
        list2.remove("66"); //if the element is not on the list nothing happrens
        list2.add(66);
        System.out.println(list2);
        list2.remove((Object)66);// casting for object//removes the first one
        System.out.println(list2);



        //addAll() --- you can add a whole collection to the list


        list3.addAll(list2);
        System.out.println("thisnis list 3"+list3);
        list3.add(77);
        System.out.println(list3);

        //removeall()--you can remove a whole collection from an ArrayList

        list3.removeAll(list2);
        System.out.println(list3);

        list3.add(88);
        list3.add(100);
        System.out.println(list3);

        //set()--replacement

        list3.set(2,200);
        System.out.println(list3);

        list3.set(0,300);
        System.out.println(list3);

        //you can use String methods

        System.out.println(list3.contains(88));
        list3.set(0, "xxxx");

        System.out.println(list3.get(0).toString().startsWith("x"));// toString is coming from object, arrays

        //clear()

        System.out.println(list3);
        list3.clear();
        System.out.println(list3);
        System.out.println(list3.size());

    }
}
