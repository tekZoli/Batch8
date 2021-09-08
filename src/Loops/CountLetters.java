package Loops;

public class CountLetters {
    public static void main(String[] args) {

        // "I want to solve this question by myself"
        //count how many  "i" and "I" are in a given sentence
        //print >>>there are .... in the given sentence

        String sent = "I want to solve this question by myself this time iiiiiiiii IIIIIIIIII";
        //sent = sent.replace("i","");
        int index = 0;
        int count = 0;
        while(index<sent.length()){

            if(sent.charAt(index) == 'i' || sent.charAt(index) == 'I'){


               count++;
            }

            index++;

        }
        System.out.println("There are " +count+" i or I in the sentence");

    }
}
