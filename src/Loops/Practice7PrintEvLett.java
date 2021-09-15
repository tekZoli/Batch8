package Loops;

public class Practice7PrintEvLett {

    public static void main(String[] args) {
        //Summer ----> print out every single letter from this word
        // S,u,m,m,e,r

        String word = "Summer";

        int length = 0;
        //  0       <   6
        while(length<word.length()){
            System.out.print(word.charAt(length)+",");
            length++;
        }


    }
}
