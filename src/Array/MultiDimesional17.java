package Array;

import java.util.Arrays;
import java.util.Locale;

public class MultiDimesional17 {
    public static void main(String[] args) {

        String[][] states = new String[3][2];

        states[0][0]="NY";
        states[0][1]="PA";
        states[1][0]="IL";
        states[1][1]="OH";
        states[2][0]="CA";
        states[2][1]="WA";

        System.out.println(Arrays.deepToString(states));

        // please create a forr loop to print these states in two minutes

        String[] stateEmails = new String[6];
        int c = 0;

        for(int i=0; i<states.length; i++){

            for (int j=0; j<states[i].length; j++){
                stateEmails[c]=states[i][j].toLowerCase()+"@info.com";
                System.out.println(states[i][j]);
                c++;
                //please create a for each loop to print out these

                System.out.println("******************************************");

                for(String[] state : states){
                    for(String st : state){

                        System.out.println(st.toLowerCase()+"@info.com");
                    }
                }
                //print these states in lower case
                // ny@info.com......
                //store these email adresses in an array





            }
        }



    }
}
