package HomeWorkCollection;

import java.util.*;

public class Task5 {

    /*
    Create one method takes String Arraylist with duplicate values, this
method need to return array with descending order of unique
element from arrayList.
Input: [“java”,“phython”,“javascript”,“c++”,“java”,“c++”]
Returns String[] ={“phython”,"javascript","java", "c++"}

    */

    public static String[] uniqueInDescending(ArrayList<String> proLanguages) {
        TreeSet<String> set = new TreeSet(proLanguages);

        String[] array = new String[set.size()];

        Iterator <String> iterator = set.descendingIterator();


        for (int i = 0; i < array.length; i++) {
            array[i]= iterator.next();

        }
        return array;
    }

    public static void main(String[] args) {

        ArrayList<String> ln=new ArrayList<>();

        ln.add("java");
        ln.add("phython");
        ln.add("javascript");
        ln.add("c++");
        ln.add("java");
        ln.add("c++");
        System.out.println(Arrays.toString(uniqueInDescending(ln)));
    }
}

//    public static void descendingUnique(ArrayList<String> array){
//        TreeSet<List> newSet = new TreeSet<List>();
//        for (int i = 0; i < array.size(); i++) {
//            newSet.add(array.get(i));
//        }
////
////
////        Iterator it = newSet.descendingIterator();
////        while (it.hasNext()){
////            System.out.println(it.next()+", ");
////
////        }
//        String[] arry = (String[]) newSet.toArray();
////        for (int i = 0; i<arry.length/2 ; i++) {
////            String temp= arry[i];
////            arry[i]=arry[arry.length-i-1];
////            arry[arry.length-i-1]=temp;
////        }
//        System.out.println(Arrays.toString(arry));
//
//        //nums[i]= nums[nums.length-i-1]; // 35
//        //nums[nums.length-i-1]=temp; // 7
////        List<Object> arry2 = Arrays.asList(arry);
////        Collections.reverse(arry2);
//
//
//
//    }
//
//    public static void main(String[] args) {
//
//        ArrayList<String> array = new ArrayList<>();
//        array.add("java");
//        array.add("javascript");
//        array.add("c++");
//        array.add("java");
//        array.add("c++");
//        array.add("phython");
//        System.out.println(array);
//        System.out.println(array.size());
//
//        descendingUnique(array);
//
//
//
//
//
//
//    }
//
//}
