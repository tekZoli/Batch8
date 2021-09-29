package MentoringAhmet.EmployeeProject;

import java.sql.SQLOutput;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int work, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = work;
        this.hireYear = hireYear;
    }

    public double taxCalculator(){
        if(salary>=1000){
            return salary*0.03 ;
    }return 0.0;
    }

   public int bonusCalculation(){
        int extraHours=workHours-40;
       if(extraHours>0){
            return extraHours * 30;
        }else {
            return 0;
        }
    }

    public double increaseSalary(){
        int year = 2021-hireYear;
        if(year<10){
            salary=salary*0.05;
        }
        else if(year<20 && salary>9){
            salary=salary*0.10;
        }else if(year>19){
            salary=salary*0.15;
        }
        return salary;
    }

    public void information(){
        System.out.println("Name : "+ name);
        System.out.println("Salary : "+salary);
        System.out.println("WorkHours : "+workHours);
        System.out.println("Hire year : "+ hireYear);
        System.out.println("Tax :"+ taxCalculator()+"$");
        System.out.println("Bonus :"+ bonusCalculation());
        System.out.println("Salary increase :"+ increaseSalary());
        double totalSalary = (salary-taxCalculator()+bonusCalculation());
        System.out.println("Total salary with tax calculation :"+ totalSalary);
        System.out.println("Tottal salary with increase salary :"+increaseSalary());
    }



}




