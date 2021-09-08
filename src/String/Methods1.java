package String;

import java.sql.SQLOutput;

public class Methods1 {

    public static void main(String[] args) {

        String city = "Chicago";

        city.concat(" is very cold");

        System.out.println(city); // chicago

        String newCity = city.concat(" is very beautiful");

        System.out.println(city); //---> Chicago
        System.out.println(newCity); // --> Chicago is very beautiful.
        // string is immutable, unchangeable, which means original value will not change unless you reassign it, or create a new String variable

        System.out.println(newCity.length());


        //int letterCount = newCity.lenght();

        city.charAt(0); //C-- chicago

        city.charAt(3);

      //  city.charAt(9); --- since there is no index of 9






    }
}
