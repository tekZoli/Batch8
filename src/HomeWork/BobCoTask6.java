package HomeWork;

public class BobCoTask6 {
    public static void main(String[] args) {


        double salary = 200000;
        double bonus5Per = (50*salary/100)*0.05;
        double bonus8Per = (30*salary/100)* 0.08;
        double bonus10Per = (20*salary/100)*0.1;
        double bonusTotal = bonus5Per+bonus8Per+bonus10Per;

        System.out.println(bonus5Per);
        System.out.println(bonus8Per);
        System.out.println(bonus10Per);
        System.out.println(bonusTotal);
        System.out.println("Total bonus for Bob this year is "+bonusTotal);




    }


}
