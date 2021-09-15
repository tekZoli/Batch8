package Loops;

public class ForLoop4 {
    public static void main(String[] args) {
        /*
        String str = " abc123457*!&;
        count how many letters there are in the string
        count and print out how many numbers are there in the string
        count and print out how many other chars are there in the string
        "There are 3 letters in the string
         */

        String str = "aBc1234^&*@#!!";
        int letterCounter = 0;
        int charCounter = 0;
        int numCounter = 0;


        for ( int i=0 ; i<str.length(); i++ ){

            if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
                letterCounter++;
            }else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                numCounter++;
            }else{
                charCounter++;
            }


        }
        System.out.println(letterCounter);
        System.out.println(charCounter);
        System.out.println(numCounter);



    }
}
