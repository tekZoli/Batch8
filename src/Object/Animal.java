package Object;

public class Animal {

    String name = "Jerry";
    int age;
    double weight;////instance variables
    int legNumber;
    String gender;
    double energy;

//access modifier*  *name of method-parameters
    public     void      run(String destination) { ///scope/block
//           -return type-
        energy-=10;
        System.out.println(name + " is running "+destination);

        //create a sleep method and print >> is sleeping
        //make every animal sleep
    }


public void sleep(){
        energy=100;
    System.out.println(name+" is sleeping");
    }

//create 'printInfo() method to print out all info
//about the animal

public void printInfo(){

    System.out.println("Name is "+name+" age "+age+" weight "+weight+" legnumber is "+legNumber+" your energy is "+energy);

}




}




