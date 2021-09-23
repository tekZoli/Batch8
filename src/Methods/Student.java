package Methods;

public class Student {

    static String schoolName;
   String studentName; //non static
    static String schoolAddress;
    String studentTableNumber;
    int studentAge;


    public void setStudentName(String studentName1){
        studentName=studentName1;
    }

    public static void setSchoolName(String schoolName1){
        schoolName=schoolName1;
    }

    public void setStudentTableNumber(String studentTableNumber1){
        studentTableNumber=studentTableNumber1;
    }
    public void setStudentAge(int studentAge1){
        studentAge=studentAge1;
    }
    //public static void setSchoolAddress(String setSchoolAddress1) {
        //setSchoolAddress=setSchoolAddress1;
  // }



}
