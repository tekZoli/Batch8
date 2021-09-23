package Array;

public class PracticePractice {
    public static void main(String[] args) {

        String[][] devices={ {"Apple", "Lenova", "HP", "DEll", "Acer"},{ "Samsung", "LG", "Sony"},{"Alexa", "Google", "Logitec", "JBL"} };
        double[][] prices = {{2500,1600,1800,1900,1100},{2199,1799,1599},{79.99,89.99,64.99,55.99}};

        for(int i=0; i< devices.length;i++){

            for(int j=0; j<devices[i].length; j++){

                System.out.println("The device is "+devices[i][j]+" and the price is "+prices[i][j]);
            }
        }//System.out.println("The list of devices is "+devices[i][j]+" and their prices are "+prices[i][j]);

    }
}







