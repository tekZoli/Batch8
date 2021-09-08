package Loops;

public class ForLoops2 {
    public static void main(String[] args) {



    /*
    print out the letter from given String value
    // print out every letter from chicago
//print out the letter from end
//print out only the letter 'o' from this String
//count the amount of letter 'o's
     */

        String word = "Chicago";

        for (int i = 0; i<=word.length()-1; i++){

            System.out.println(word.charAt(i));
        }

        System.out.println("**********************************");

        for (int index = word.length()-1; index>=0; index--){

            System.out.println(word.charAt(index));

        }

        String string = "Today is the day to practice for loop";

        int count = 0;

        for(int k = 0 ; k < string.length() ; k++ ){// this is the cycle part
            if(string.charAt(k)=='o'){
                System.out.println(string.charAt(k));
                System.out.println("The index number of o is "+k);
                count++;
                System.out.println("The index number of o is "+count+". 'o' is "+k);
            }

        }//if I create it inside I can reach it only inside, local variable
        System.out.println("Count is "+count);
// if I create it after the loop it will

        // print out " the index number of o is " and show the index number






    }
}
