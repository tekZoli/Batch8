package OOP.Inheritance;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Animal animal1 = new Animal();
        System.out.println("animal color"+animal1.color);//null

        System.out.println(animal.color);

        WildAnimal wildAnimal = new WildAnimal();

        System.out.println(wildAnimal.color);

        Cat cat = new Cat();

        System.out.println(cat.color);

        animal.color = "brown";

        System.out.println(animal.color);

        System.out.println(cat.color);//null

        System.out.println(wildAnimal);//hippo


        System.out.println(animal.name);

        System.out.println(animal.name);



        System.out.println(wildAnimal.name);//crock

        Lion lion = new  Lion();

        System.out.println(lion.name); //crock

        cat.name="Tommy";

        DomesticAnimal domesticAnimal = new DomesticAnimal();

        System.out.println(domesticAnimal.name);//hippo

        System.out.println(cat.name);//Tommy

        domesticAnimal.name="Rex";

        System.out.println(cat.name);//Tommy
        System.out.println(domesticAnimal.name);//rex

        animal.eat();

        lion.eat();//Animal is eating
        wildAnimal.eat();//Animal is eating
// after we override methods in wildanimal class
// after we override methods in Lion class
        //------------------
        wildAnimal.run();
        //after override method in Lion class
        lion.run();
        lion.roar();// method available to lion only

    }
}
