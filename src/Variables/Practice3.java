package Variables;

public class Practice3 {

    public static void main(String[] args){

        int apple; // declaring the variable which means giving the data type a name

        apple=25;  // initializing the variable, which means assigning value for it

        int banana = 2; // declaring and initializing in one line

        System.out.println("Number of apples: "+apple); //25

        apple=23; // Reassigning the value for the variable (changing the value/amount of the variable)

        System.out.println("Number of apples: "+apple);  //23

        int $apple=10;
        int _apple=11;
        int apple$=12;
        int apple_=13;
        // int %apple=15; it's a compile time error
        // int 2apple = 16; compile time error
        int apple2 = 17; // you can't start the name of a variable with a number, but you can end it
        int a$$le=18; //will compile but not going to make sense

        // there are 23 apples and 2 bananas

        int applePrice = 3; // more than one word, from the second on it's upper case
        int bananaPrice = 2;
        int totalApplePrice=apple*applePrice;
        int totalBananaPrice = banana*bananaPrice;

        System.out.println(totalApplePrice+totalBananaPrice+ " is your total payment");


        int payment  = totalApplePrice+totalBananaPrice;
                System.out.println(payment);






    }




}
