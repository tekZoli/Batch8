package ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        ArrayList <String> colors= new ArrayList<>();

        colors.add(0,"Blue");
        colors.add(1,"Black");
        colors.add(2,"White");
        colors.add(3,"Yellow");
        colors.add(4,"Green");
        System.out.println(colors);

        for(int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }


        for( String color : colors){
            System.out.println("This is forEach loop: "+colors);
        }


        //name your method as >>>printFruits
        //create a method that will take an arraylist as paranmeter
        //prints the elements if they have 5 or more letters

        ArrayList<String> fruitNames = new ArrayList<>();


        fruitNames.add("kiwi");
        fruitNames.add("apple");
        fruitNames.add("banana");
        fruitNames.add("pineapple");
        fruitNames.add("plum");

        Practice object = new Practice();

        //printFruits(fruitNames);

       //printFruits(colors);

    }





//    public static void printFruits(ArrayList<String> fruits){
//        for(String fruit : fruits){
//            if(fruit.length()>=5) {
//                System.out.println(fruit);
//            }else{
//                fruits.remove(fruit);
//            }
//        }
//
//    }







}


