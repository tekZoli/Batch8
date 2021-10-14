package Abstraction;

public class Test {
    public static void main(String[] args) {

        //Student st = new Student(); --you cannot
        // create an object from an abstract class
        CampusStudent campusStudent= new CampusStudent();
        campusStudent.study();
        campusStudent.studyTime();
        campusStudent.attend();

        Sorin sorin = new Sorin();
        sorin.speak();
        sorin.attend();

        OnlineStudents onlineStudents=new OnlineStudents();

        //Lazy lazy =new Lazy();--cannot beacuse lazy is also abstract

    }
}
