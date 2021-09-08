package Primitives;

public class LogicalOperatorPractice1 {

    public static void main(String[] args) {

        // There is an event for kids, they must be 5 or older than 5, 12 or younger than 12
        // They're height needs to be more than 46" to be able to attend
        /* boolean kidAgeReq = 5 >= 12;
        boolean kidHeightReq = 0>46;
        boolean partyReq = kidAgeReq && kidHeightReq;*/

        int kidAge = 2;
        int kidHeight = 36;

        int minAge = 12;
        int maxAge = 46;

        int reqHeight = 46;
         // boolean ok = (kidAge >= minAge && kidAge <= maxAge) >= reqHeight;


        /*
        - you need to pas a couse
        -if you attend 95% or more of the classes
        or
        -you get more than 70 as passing score out of 100

         */

        int i = 96;
        int i2 = 64;
        int attend = 95;
        int score = 70;

        boolean pass = i >= attend || i2 > score;

        System.out.println("I am passing = "+pass);
        System.out.println(!pass);














    }
}
