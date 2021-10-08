package Set;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        HashSet set1 = new HashSet();

        HashSet<String> set2 =new HashSet();

        Set set3 = new HashSet<String>();// diamond brackets can go anywhere

        set1.add("Chicago");//because it's a method we can only add one by one
        set1.add("Dallas");
        set1.add("Columbus");
        set1.add("Denver");
        set1.add("New York");
        set1.add("Chicago");
        set1.add(12);
        set1.add(true);
        System.out.println(set1);
        set1.add(null);
        System.out.println(set1);
        set1.add("Chicago");
        System.out.println(set1);////you cannot have duplicates
        ///once you add the arrangement stays the same, just cannot predict the lineup ahead of time
        //there is no get() method to reach out for specific element

        for(Object x : set1){
            System.out.println((x));
        }

        //print only Denver from set1

      //  for(Object x : set1){
       //    if(x.equals("Denver")&&!(x.equals(null))){
        //       System.out.println();
         //  }
        //}
///THERE IS NO INDEXING SO FOR LOOP THOUGH INDEX I WONT WORK

        set1.remove(null);
        System.out.println(set1);
        for(Object x : set1) {
            if (x.equals("Denver")) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>" + x);
            }
        }

        set1.clear();
        System.out.println(set1);


    }
}
