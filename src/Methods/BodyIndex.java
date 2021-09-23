package Methods;

public class BodyIndex {

    //let's do for kg and meter

    public double bmi(int kg, double meter) {
        //we need to divide kg to square meter
        double squareMeter = meter * meter;
        return kg / squareMeter;
    }

    //we are asked to calculate body index for US
    public double bmi(int pound, int feet, int inch) {
        double kilogram=pound*0.45;
        double meter = feet*0.3+0.025;
        double squareMeter = meter*meter;
        return kilogram/squareMeter;
    }

    public static void main(String[] args) {
        BodyIndex bodyIndex=new BodyIndex();
        System.out.println(bodyIndex.bmi(79,1.8));
        System.out.println(bodyIndex.bmi(174, 5, 10));

    }
// overloading is: 1.same method name/different parameters
//if the method name is the same and has different parameters it is overloading
//access modifier or return type are not important for overloading


//advantages of overloading are that it increases the readibility of the copde
//it is more flexible, so we can call same method with different parameters
//code looks cleaner
//we can use the same method which saves memory for us
//it increases the reusability of the code


}
