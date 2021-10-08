package MAP;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {

    public static void main(String[] args) {
        HashMap <String, String> map = new HashMap<>();//<String,Double> is okay,<String, ArrayList>

        HashMap<String, HashSet<Integer>> map3=new HashMap<>();
        HashMap <HashMap<String, Integer>,String> map4= new HashMap();

        map.put("11","David");
        map.put("22", "Alex");
        map.put("33", "Sorin");

        System.out.println(map);
        map.put("33", "Zack");
        System.out.println(map);

        map.put("44", "Alex");
        System.out.println(map);

        map.put(null, "Jenny");
        System.out.println(map);
        //you can't have more than one null key, but it updates the value
        map.put(null, "Arzu");
        System.out.println(map);

        map.put("55", null);
        map.put("66", null);
        map.put("77", null);
        System.out.println(map);

//get()

        System.out.println("This is the function of get()== "+map.get("22"));
        //String nullValue = map.get(null);
        //System.out.println(nullValue.concat("***"));

        System.out.println(map.get(null).concat("!!!!"));

        System.out.println("this is the function of the keyset "+map.keySet());
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // we don't have index so forLoop(i) won't work
        System.out.println("+++we.got.the.keys.now.we.got.the.values++++");


        for(String key : keys){
            System.out.println(map.get(key));
        }


    }
}
