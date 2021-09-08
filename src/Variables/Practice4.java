package Variables;

public class Practice4 {

    public static void main(String[] args){
       /*

       in a farm,
       there are 12 cows and 23 chickens
       each chicken's cost is 10$
       each cow is 500$
       1- calculate the total number of legs of the animals in this farm
       2-
        */
        int chickens=23;
        int cows= 12;
        int cowLegs= 4;
        int chickenLegs=2;


        int totalCowLegs = cows*cowLegs;
        int totalChickenLegs = chickens*chickenLegs;

        int totalLegs = totalCowLegs+totalChickenLegs;

        System.out.println(" Total number of legs in this farm is: "+totalLegs);

        int cows$ =500;
        int chicken$ = 10;

        int total$ = cows*cows$ + chickens*chicken$;

        System.out.println(" Total cost of animals in the farm is: "+total$);

        System.out.println( cows*cows$ + chickens*chicken$);

        System.out.println(" Total cost of animals in the farm is:" +(cows*cows$ + chickens*chicken$));




    }
}
