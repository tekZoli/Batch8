package Variables;

public class Practice2 {

    public static void main(String [] args){

        int apples=10;
        int oranges=20;
        int kiwi=30;
        int totalFruits=60;

        System.out.println(oranges);
        System.out.println(kiwi);
        System.out.println(" There are total number of fruits = "+apples+oranges+kiwi);
        System.out.println(" There are total number of fruits = "+(apples+oranges+kiwi));
        System.out.println(" There are total number of fruits = "+"apples+oranges+kiwi");

        System.out.println(apples+oranges+" is total of apples and oranges");
        System.out.println("Total number of fruits is " +(totalFruits));

        // in one line, print "The total number of apples and kiwis is <..> and difference between kiwi and orange is <..>"

        System.out.println( "The total number of apples and kiwis is " +(apples+kiwi)+  " and the difference between kiwi and orange is " +(kiwi-oranges));



    }




}
