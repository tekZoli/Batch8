package RecapWithAhmet;

import java.util.HashMap;

public class MAP {
    public static void main(String[] args) {


        //can you tell me about map and why do you use it?
        //id number is key and customer is the value????????/is the way of storing data as a key and value format


        //what is the connection between map and collections?
        //map has key/value, and key only stores the unique value and it is acting as a set
        //value may or may not store duplicates as a value which means is acting like list


        //what types of map you know and differences
        //Hashmap--randomly stores
        //LinkedHashMap --insertion order
        //TreeMap--ascending order

        //HashMap!!!!!!!
        // is Thread Safe(NOT SYCHRONIZED)
        //it means the system will wait i]until the action is done then it will continue

        String[] brands = {"Apple", "Banana", "Orange", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple", "Orange", "Banana", "Apple"};

        HashMap<String, Integer>brandCounts=new HashMap<>();

        for (int i = 0; i < brands.length; i++) {

            if (!brandCounts.containsKey(brands[i])) {
                brandCounts.put(brands[i], 1);
            } else {

                brandCounts.put(brands[i], brandCounts.get(brands[i]) + 1);
            }

        }
        System.out.println(brandCounts);


    }
}