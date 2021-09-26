package Methods;

import java.util.Random;

public class StudentClass {



    String firstName;
    String lastName;
    int age;



    public void sleep(String place){
       int hour=generateHour();
        System.out.println(firstName+" is sleeping "+place+" "+ hour+" hours");
    }

    public static void study(){

        System.out.println(" is studying  hours");
    }

    public void run(){

        System.out.println(firstName+" is running "+generateHour()+" hours");

    }
    public int generateHour(){

        Random random = new Random();
        int hour=random.nextInt(8);

        return hour;
    }



    public static void main(String[] args) {


        StudentClass student1 = new StudentClass();

        student1.firstName="John";
        student1.lastName="Cena";
        student1.age=36;
        student1.study();
        student1.sleep(" in class");
        student1.run();
        student1.generateHour();

        study();
        StudentClass.study();
    }
}
