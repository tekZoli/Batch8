package Set;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet<>();

        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();

        TreeSet<Integer> treeSet = new TreeSet();

        hashSet.add(99);                linkedHashSet.add(28);              treeSet.add(39);
        hashSet.add(56);                linkedHashSet.add(27);              treeSet.add(32);
        hashSet.add(13);                linkedHashSet.add(23);              treeSet.add(35);
        hashSet.add(14);                linkedHashSet.add(24);              treeSet.add(36);
        hashSet.add(null);              linkedHashSet.add(null);            //treeSet.add(null);
        System.out.println(hashSet);    System.out.println(linkedHashSet);   System.out.println(treeSet);
        System.out.println("*****");    System.out.println("*****");        System.out.println("*****");

        for(Integer number : treeSet){

            boolean b = number.toString().equalsIgnoreCase("35");
            String str = number==35 ? "i found 35" : "I couldn't find 35";
            System.out.println(str);
            System.out.println(b);
        }
        Iterator interator = treeSet.iterator();

        while (interator.hasNext()){
            System.out.println(interator.next());
        }

        Iterator iterator1= hashSet.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

//looping over arraylist by using iterator
        ArrayList <String> veggies = new ArrayList<>();
        veggies.add("tomato");
        veggies.add("lettuce");
        veggies.add("carrot");
        Iterator iterator2= veggies.iterator();

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
 //sorting collection via sort() method
            Collections.sort(veggies);
        }

        //conveet arrayList to set

        HashSet set1 = new HashSet(veggies);
        //System.out.println("this is a list to set"+set1);

        //set to arrayList

        ArrayList list1 = new ArrayList(set1);
        System.out.println("This is new Arraylist from set"+list1);
    }
}
