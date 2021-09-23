package Methods;

public class AgeTest4 {


    public static void main(String[] args) {


        AgeCalculator3 tommy = new AgeCalculator3();

        //tommy.ageCalculator(1990);
        int b = tommy.ageCalculator();
        if(b==25) System.out.println("Yoiu mest be happy");
        String x =tommy.ageCalculator(2018,"John");
        System.out.println(x);


    }
}
