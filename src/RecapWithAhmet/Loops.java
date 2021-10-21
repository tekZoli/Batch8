package RecapWithAhmet;

public class Loops {
    public static void main(String[] args) {

        /*

        Loop---> is defined as a cycle, it means the action repeats unless condition is true
        1)Do While
        2)While
        3)For
        4)For Each
         */
        int number = 123456;
        //sum of digit and multiplication of the digit
        //21 //720
        int i = 0;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println(sum);

        String word = "Please reverse me";
        String reverse = "";

        for (int j = word.length() - 1; j >= 0; j--) {
            reverse = reverse + word.charAt(j);

        }
        System.out.println(reverse);

        //NESTED LOOP
        //find the duplicate letter
        String word1 = "Please reverse me";
        //output ====> e,s,r
        boolean isMatching = false;
        String result="";

        for (int j = 0; j < word1.length(); j++) {
                isMatching=false;
            for (int k = j + 1; k < word.length(); k++) {
                if (word1.charAt(j) == word1.charAt(k)) {
                    isMatching = true;
                }
            } if (isMatching&&!result.contains(""+word1.charAt(j))&&word1.charAt(j)!=' ') {
                result+=word1.charAt(j);

            }
            System.out.println(result);


        }
    }
}