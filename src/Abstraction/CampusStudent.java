package Abstraction;

public class CampusStudent extends Student{

    @Override
    public void sleep() {
        System.out.println("On campus student is sleepig");
    }

    @Override
    public void attend() {
        System.out.println("Student is attending en person");
    }

    @Override
    public int studyTime() {

        return 8;
    }



}
