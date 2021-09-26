package MentoringAhmet;

import java.util.Arrays;

public class SwitchingWords {

    public static void main(String[] args) {

        String[] array={"four", "flowers", "sun", "eleven", "cloud", "better", "git"};
        String temp;
        for (int i = 0; i < array.length-1; i++) {

           //String[] array={"four", "flowers", "sun", "eleven", "cloud", "better", "git"};

            String temps=array[i];
           //temps="four"
            array[i]=array[i+1];
            //String[] array={"flowers", "flowers", "sun", "eleven", "cloud", "better", "git"};

            array[i+1]=temps;
            //String[] array={"flowers", "four", "sun", "eleven", "cloud", "better", "git"};

                    i++;
                }
        System.out.println(Arrays.toString(array));

        String[] array3={"2", "1", "4", "3", "6", "5", "7"};
;
        for(int j=0;j<array3.length-1;j+=2){
            String temps=array3[j];
            array3[j]=array3[j+1];
            array3[j+1]=temps;
            j++;
        }
        System.out.println(Arrays.toString(array3));

    }
}
