package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {








    public static void main(String[] args) {

        HashMap <String, Integer> dataMap = new HashMap<>();

        dataMap.put("IT", 111);
        dataMap.put("HR", 222);
        dataMap.put("Help", 333);
        dataMap.put("Admin", 444);


        System.out.println(" this is the values function "+dataMap.values());

        //get individual values
        //get all values
        //get a single element

        //entrySet
        System.out.println(dataMap);
        System.out.println(dataMap.entrySet()); //returning a set of entries, the storage ty willbe the type we have

        System.out.println("this is the function of entrySet " +dataMap.entrySet());
        Set <Map.Entry<String, Integer>> data = dataMap.entrySet();
        System.out.println("entry set"+data);

        // create a method which takes a parameter of map, and this method will print out each extension one by one

        //task: print put elements from this set one at a time

        for ( Map.Entry<String, Integer> keyAndValue : data ) {
            System.out.println(keyAndValue);
        }
//        for(Map.Entry<String,Integer> keyAndValue : data){
//            System.out.println(keyAndValue.getKey()+"---"+keyAndValue.getValue());
//        }


        ext(dataMap);
    }




    public static void ext(HashMap<String,Integer> results){
        for(Integer extensions : results.values()){
            System.out.println(extensions);
        }

    }

}
