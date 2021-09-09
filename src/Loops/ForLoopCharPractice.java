package Loops;

public class ForLoopCharPractice {

    public static void main(String[] args) {
        /*
        print out the alphabet in upper case letters
        //printiong letters one lower case one upper case
         */

       for( char ch = 'A', ch1 = 'a'; ch <= 'Z' && ch1 <= 'z'; ch+=2, ch1+=2){

           System.out.print(ch+"-");
           System.out.print(ch1+ "-");
       }



    }
}
