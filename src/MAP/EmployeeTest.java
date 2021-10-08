package MAP;

import java.util.HashMap;

public class EmployeeTest {
    public static void main(String[] args) {


        Employee e1 = new Employee("Zack", "chicago", 22);
        Employee e2 = new Employee("Bobby", "Saint louis", 25);
        Employee e3 = new Employee("David", "Colombus", 45);
        Employee e4 = new Employee("Nick", "New York", 34);

        HashMap<Integer,Employee> employees = new HashMap<>();

        employees.put(e1.id,e1);
        employees.put(e2.id,e2);
        employees.put(e3.id,e3);
        employees.put(e4.id,e4);

        printNames(employees);
        printId(employees);
    }

    public static void printNames(HashMap<Integer, Employee>map1){
        for(Employee e: map1.values()){
            System.out.println(e.name);
        }
    }

    public static void printId(HashMap<Integer, Employee> map1){

        System.out.println(map1.keySet());
    }
}
