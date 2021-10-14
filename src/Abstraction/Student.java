package Abstraction;

public abstract class Student {

    String name;
    int age;

    public Student(){}

    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }

   public void study(){
       System.out.println("The student is studying");
   }

   public abstract void attend();

   public abstract void sleep();

   public abstract int studyTime();

}
