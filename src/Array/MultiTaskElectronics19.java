package Array;

public class MultiTaskElectronics19 {

    public static void main(String[] args) {

        /*Computers
                "Apple", "Lenova", "HP", "DEll", "Acer"
        TVs
                "Samsung", "LG", "Sony"
        Speakers
                "Alexa", "Google", "Logitec", "JBL"
        --------------
                Prices
        Computers
        Apple --2500,1600,1800,1900,1100
        TVs
        2199,1799,1599
        Speakers
        79.99,89.99,64.99,55.99
// STORE Brand in a multidimensional array
// STORE Prices in a multidimensional array
// print out prices for each product as:
// "price for Apple is $2500"

         */

        String[][] departments = {{"Apple", "Lenova", "HP", "DEll", "Acer"},{"Samsung", "LG", "Sony"},{"Alexa", "Google","Logitec","JBL"}};
        double[][] price={{2500,1600,1800,1900,1100},{2199,1799,1599},{79.99,89.99,64.99,55.99}};

               /* for(String[] brands  : departments){

                    for(String device: brands){}////////---for each loop wont work because of different data type

                }

                */

        for(int i=0; i<departments.length;i++){

            for(int l=0; l<departments[i].length; l++) {

                System.out.println("Price for " + departments[i][l] + " is $" + price[i][l]);

            }

        }


    }
}
