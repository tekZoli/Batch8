package ArrayList;

import java.util.ArrayList;

public class Computer {

   /* Computer class
--------------------
  instance fields:  make         model       price   screen
                    apple      macbook Air 1500    13.5
                    apple      macbookpro  2000    16
                    HP         Envy        1100    15.0
                    Lenova     ThinkPad     900    11

    show the price of the computer that haas the price between 500 to 1500
    */


    String make;
    String model;
    double price;
    double screenSize;


    public Computer(String make, String model, double price, double screenSize) {
                this.make = make;
                this.model = model;
                this.price = price;
                this.screenSize = screenSize;

    }

    public static void method(ArrayList<Computer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).price >= 500 && list.get(i).price <= 1500) {
                System.out.println(list.get(i).make);
            }
        }
    }

    public static void main(String[] args) {
        Computer pc1 = new Computer("Apple", "macbook air", 1500, 13.5);
        Computer pc2 = new Computer("Apple", "macbook pro", 2000, 16);
        Computer pc3 = new Computer("HP", "Envy", 1100, 15);
        Computer pc4 = new Computer("Lenovo", "ThinPad", 900, 11);

        ArrayList <Computer> list = new ArrayList();

        list.add(pc1);
        list.add(pc2);
        list.add(pc3);
        list.add(pc4);

        method(list);

    }
}