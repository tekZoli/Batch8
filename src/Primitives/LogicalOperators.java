package Primitives;

public class LogicalOperators {
    public static void main(String[] args) {

        int myAge = 15;
        boolean myDress = true;

        int ageRequirement = 21;
        boolean dressCode = true;

       boolean can_I_Attend =  myAge >= ageRequirement && myDress == dressCode;

        System.out.println("Can I attend :" +can_I_Attend);

        myAge =21;
        boolean can_I_Attend1 =  myAge >= ageRequirement && myDress == dressCode;

        System.out.println("Can I attend :" +can_I_Attend1);

        //=========================================================

        int myNewAge = 28;

        boolean myMoney = false;

        int ageReq = 18;

        boolean moneyReq = true;

        boolean canIGo = myNewAge >= ageReq || myMoney == moneyReq;

        System.out.println("Can I go: "+canIGo);

        myNewAge = 8;

        canIGo = myNewAge >= ageReq || myMoney == moneyReq; //no boolean because condition changes

        System.out.println(canIGo);


        myMoney = true;
        canIGo = myNewAge >= ageReq || myMoney == moneyReq;


        System.out.println("Can I go: "+canIGo);







    }
}
