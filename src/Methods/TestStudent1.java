package Methods;

public class TestStudent1 {

    public static void main(String[] args) {
        Student student1= new Student();
        Student student2= new Student();

        //static variables are the same for every object

        student1.setStudentName("David");
        student2.setStudentName("John");

        System.out.println(student1.studentName);
        System.out.println(student2.studentName);
        student1.setSchoolName("Techtorial");
        System.out.println(student2.schoolName);
        student2.setSchoolName("Tech School");
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        //Student.setSchoolAddress("2200 E Devon Ave");
        System.out.println(student1.schoolAddress);
        System.out.println(student2.schoolAddress);

        setStaticVariables("Techtorial");
        Student student3 = new Student(); 
        System.out.println(student3.schoolAddress);

    }

    public static void setStaticVariables(String schoolName) {
        Student.setSchoolName(schoolName);
    }
}
