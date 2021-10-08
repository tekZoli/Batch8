package MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"des plaines");
        map.put(2,"lake forest" );
        map.put(3, "chicago");
        map.put(4,"austin" );
        map.put(5, "new york");

        //size()

        System.out.println(map.size());
        map.put(null,null);
        System.out.println(map);

        map.put(1,"schaumburg");
        System.out.println(map);

        map.replace(1,"XXXX");
        System.out.println(map);

        map.replace(1,"XXX", "YYYY");

        Boolean bl=map.containsKey(2);
        boolean bl1 = map.containsKey(3);
        boolean bl2 = map.containsValue("washington");
        System.out.println(bl2);

        map.remove(1);
        System.out.println(map);

        //print out all the values from this map one by one

        Set<Integer> zipCodes = map.keySet();

        System.out.println(zipCodes);
        // iterate over the keys that contain all the zipcodes
        for(Integer cities : zipCodes){
            System.out.println(map.get(cities)); // pass each key into get() method to get the values
        }
        Collection<String> city = map.values();
        System.out.println(city);

        for (String cities2 : map.values()) {
            System.out.println(cities2);
        }



//        map.clear();
//        System.out.println(map);

    }
}
