package MAP;

import java.util.HashMap;

public class CountAndStore2 {
    public static void main(String[] args) {

       String string = "It is easy with practice";
        //I-- ? 1
        //t --3
        //i-- 3
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {

            if(string.charAt(i)==' '){
                continue;
            }

            if(!letterCount.containsKey(string.charAt(i))){
                letterCount.put(string.charAt(i),1);


            }else{
                letterCount.put(string.charAt(i),letterCount.get(string.charAt(i))+1);
            }

        } System.out.println(letterCount);
    }
}
