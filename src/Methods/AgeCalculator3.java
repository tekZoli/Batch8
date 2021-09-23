package Methods;

public class AgeCalculator3 {

    //create a method that will take one int parameter for your birthyear,
    //this method simply calculates your age

    public void ageCalculator(int birthYear){

        int age= 2021-birthYear;
        System.out.println("Your age is: "+age);
    }

    public int ageCalculator(){

        int age= 2021-2015;
        System.out.println("Your age is: "+age);
        return age;
    }
    public String ageCalculator(int birthYear, String name){

        int age= 2021-birthYear;
        //System.out.println(name+" your age is: "+age);

       return ""+name+" your age is "+age;
    }

    //overload the w method by passing a string parameter
    //which is going to be the name of the person
    //and print out the age of the peron as:
    //".....your age is....."

    public static void main(String[] args) {

        AgeCalculator3 jerry = new AgeCalculator3();

        jerry.ageCalculator(2013);
    }
}
