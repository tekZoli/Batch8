package MAP;

import Methods.Math;

import java.util.Random;

public class Employee {

    String name;
    String city;
    int age;
    int id;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = generateId();
    }

//    public int generateId() {
//    Random random = new Random();
//        //int x = (int)(Math.random()*100000);
//        return random.nextInt(999999);
//    }

    public static int generateId(){
        Random random = new Random();
        String idN ="";
        for(int i=1; i<=6;i++){
            idN+= random.nextInt(10);
        }
        return Integer.parseInt(idN);
    }



}
