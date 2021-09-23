
package Object;

public class AnimalTestClass {
    public static void main(String[] args) {

        Animal cat = new Animal();

        System.out.println(cat.name);
        cat.name = "Tom";
        System.out.println(cat.name);

        cat.age = 5;
        cat.weight = 8.5;
        cat.legNumber = 4;

        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.legNumber);

        //create a dog object and initialize each variable and print it out

        Animal dog = new Animal();

        dog.name = "Buster";
        dog.age = 3;
        dog.weight = 50;
        dog.legNumber = 4;
        dog.gender = "male";

        System.out.println(dog.legNumber);
        System.out.println(dog.name);
        System.out.println(dog.weight);
        System.out.println(dog.gender);

        Animal bird = new Animal();

        System.out.println(bird.weight);

        cat.run("west");
        dog.run("south");

        cat.sleep();
        dog.sleep();
        bird.sleep();

       cat.printInfo();
       bird.printInfo();
        cat.printInfo();

        System.out.println("=====================");
        bird.legNumber=2;
        cat.energy=100;
        cat.printInfo();
        cat.run("west");
        cat.printInfo();
        cat.run("west");
        cat.run("west");
        cat.printInfo();
        cat.sleep();
        cat.printInfo();
//=====================================================

        bird.energy=100;
        bird.sleep();

        //bird.run("flying east");



    }
}
