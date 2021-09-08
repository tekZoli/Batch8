package Variables;

public class Practice5 {

    public static void main(String[] args){

         /*

       in a farm,
       there are 12 cows and 23 chickens
       each chicken's cost is 10$
       each cow is 500$
       1- calculate the total number of legs of the animals in this farm
       2- calculate total cost of cows then chickens and finally the total cost of animals

        */

       int cows=12;
       int chickens=23;
       int chickensLegs=chickens*2;
       int cowsLegs=cows*4;
       int totalLegs=cowsLegs+chickensLegs;
       int cows$=500;
       int chickens$=10;
       int totalChickens$=chickens*chickens$;
       int totalCows$=cows*cows$;

        System.out.println("The total number of legs on the farm is " +(chickensLegs+cowsLegs));
        System.out.println("The total number of legs on the farm is " +totalLegs);
        System.out.println("The total cost of chickens is " +(totalChickens$) + " and the total price of cows is " +(totalCows$));
        System.out.println("The total cost of animals on the farm is " +(totalChickens$+totalCows$));
        System.out.println("The total cost of animals on the farm is " + totalChickens$+totalCows$);
        System.out.println("The total cost of animals on the farm is " +"totalChickens$+totalCows$");



    }

}
