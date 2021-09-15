package Array;

import java.util.Arrays;


public class ForEachLoop9 {
    public static void main(String[] args) {

        String[] colors ={"Red","Yellow","brown", "Blue", "White", "Orange","Pink","Voilet","Black"};
        //it is called "for each loop"
        //it will start from the beginning of the array and go to the end

        Arrays.sort(colors);
        for(String color: colors){//name of the storage and then the name of the array

            System.out.println(color);
        }

        int[] ids = {9,5,8,23,45,12,50,30,100,11};
        Arrays.sort(ids);
        for(int number : ids){//on the left the data type, on the right the arrays name
            //System.out.println(number);
            if(number>=50){
                System.out.println(number);
            }
        }

        char[] characters = {'g','1',5,'$','*','A','H'};

        for(char letters : characters){
            if(letters>='a' && letters<='z' || letters>='A' &&  letters<='Z'){
                System.out.println(letters);
                if(letters>='1' && letters<='9'){
                    System.out.println(letters);

                }else{
                    System.out.println(letters);
                }
            }
        }


        for(char ch : characters) {


            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                System.out.println(ch);
            }


         for(char ch1 : characters){
             if(!Character.isAlphabetic(ch) && !Character.isDigit(ch)){
                 System.out.println(ch);
             }
         }


        }//print all other symbols by using above methods

    }

}

