package MentoringAhmet.MpaPracticeWithList;

import java.util.*;

public class SuperMarket {
    public static void main(String[] args) {

        SuperMarket supermarket = new SuperMarket();
        supermarket.printDairy();
        supermarket.printChips();
        supermarket.printCookies();
        supermarket.printDairyPrice();
        supermarket.printChipsPrice();
        supermarket.printCookiePrice();
        supermarket.dNdP();
        supermarket.chipsNandChipsP();
        supermarket.cookPandcookN();
        supermarket.allProductsandPrices();


    }

    Map<String,Double> allProductsandPrices;



    //LETS DO IT STEP BY STEP:

    //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein

    String[] dairy = {"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Casein"};

    //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles

    String[] chips = {"Lays", "Fritos", "Cheetos", "Doritos", "Ruffles", "Pringles"};

    //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand

    String[] cookies = {"Nabisco", "Oreo", "Nestle", "Amos", "SnackWell", "MaryLand"};

    //TASK 1:

    //  Create three more arrays to store the prices for these products.

    //dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69,

    double[] dairyPrice = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69};

    //chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69,

    double[] chipsPrice = {3.99, 2.99, 4.99, 3.49, 1.99, 2.69};

    //cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69,

    double[] cookiesPrice = {4.99, 3.99, 5.99, 4.49, 2.99, 3.69};

    //TASK 2:

//    Create the method to print the Dairy.(do it with the list, think about the reason why )

    public void printDairy() {
        //first
        ArrayList<String> allDairyNames = new ArrayList<>();
        for (String dairyProduct : dairy) {
            allDairyNames.add(dairyProduct);
        }
        System.out.println(allDairyNames);

        ArrayList<String> allDairyNames2 = new ArrayList<>(Arrays.asList(dairy));
        System.out.println(allDairyNames2);
    }

//    Create the method to print the Chips.(do it with the list, think about the reason why )

    public void printChips() {
        ArrayList<String> allChipsNames = new ArrayList<>();
        for (String chipsProduct : chips) {
            allChipsNames.add(chipsProduct);
        }
        System.out.println(allChipsNames);
    }

    //    Create the method to print the Cookies (do it with the list, think about the reason why )
    public void printCookies() {
        ArrayList<String> allCookiesNames = new ArrayList<>();
        for (String chipsProduct : chips) {
            allCookiesNames.add(chipsProduct);
        }
        System.out.println(allCookiesNames);
    }

    //TASK 3:
    //    Create the method to print the DairyPrice.(do it with the list, think about the reason why )
    public void printDairyPrice() {
        ArrayList<Double> dPrice = new ArrayList<>();
        for (Double priceProd : dairyPrice) {
            dPrice.add(priceProd);
        }
        System.out.println(dPrice);
    }

//    Create the method to print the ChipsPrice.(do it with the list, think about the reason why )

    public void printChipsPrice() {
        ArrayList<Double> cPrice = new ArrayList<>();
        for (Double priceProd : dairyPrice) {
            cPrice.add(priceProd);
        }
        System.out.println(cPrice);
    }

//    Create the method to print the CookiesPrice (do it with the list, think about the reason why )

    public void printCookiePrice() {
        ArrayList<Double> cooPrice = new ArrayList<>();
        for (Double priceProd : dairyPrice) {
            cooPrice.add(priceProd);
        }
        System.out.println(cooPrice);
    }

        //TASK 4:
//    Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why )

           public void dNdP(){
               LinkedHashMap<String,Double> dNamesdPrice = new LinkedHashMap<>();
               for (int i = 0; i < dairyPrice.length; i++) {
                   dNamesdPrice.put(dairy[i],dairyPrice[i]);
               }
               System.out.println(dNamesdPrice);

           }

//    Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why )

                    public void chipsNandChipsP(){
                        LinkedHashMap<String, Double> allChips = new LinkedHashMap<>();
                        for (int i = 0; i <chipsPrice.length ; i++) {
                            allChips.put(chips[i],chipsPrice[i]);
                        }
                        System.out.println(allChips);
                    }

//    Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why )
                public void cookPandcookN(){
                        LinkedHashMap<String, Double> allCookies = new LinkedHashMap<>();
                        for (int i = 0; i <cookiesPrice.length ; i++) {
                            allCookies.put(cookies[i],cookiesPrice[i]);
                        }
                    System.out.println(allCookies);
                }


        //TASK 5:
        // Do all Task4 in a same method

            public void allProductsandPrices(){
//                LinkedHashMap<String,Double> dNamesdPrice = new LinkedHashMap<>();
//                LinkedHashMap<String, Double> allChips = new LinkedHashMap<>();
//                LinkedHashMap<String, Double> allCookies = new LinkedHashMap<>();
                allProductsandPrices=new LinkedHashMap<>();
                for (int i = 0; i < dairy.length; i++) {
                    allProductsandPrices.put(dairy[i],dairyPrice[i]);
                    allProductsandPrices.put(chips[i],chipsPrice[i]);
                    allProductsandPrices.put(cookies[i],cookiesPrice[i]);
                }


            }

        //TASK 6:

        //Create a method with the parameter String nameofItem and find the price of the product ?


        //Create a method with the parameter String nameofItem and replace it from the map

}
