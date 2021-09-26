package Constructor;

public class Employee {

    String name;
    int age;
    int employeeId;
    String gender;
    String comanyName="Techtorial";

    public int setEmployeeId(int id){

        employeeId=id;
        return employeeId;
    }

    public void info(){

        System.out.println(name+age+employeeId+gender+comanyName);
    }

    public Employee(){}

    public Employee(String newGender){

        gender= newGender;
    }


}
