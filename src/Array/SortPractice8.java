package Array;

import java.util.Arrays;


public class SortPractice8 {
    public static void main(String[] args) {

        int numbers[] ={45,5,6,47,57,8,12,0,30};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);// sort method will put elements in ascending order(from smallest to larger)
        System.out.println(Arrays.toString(numbers));


        String[] colors ={"Red","Yellow","brown", "Blue", "White", "Orange","Pink","Voilet","Black","12","43", "aBC","ABcd","abcD","A","B","C"};

        System.out.println(Arrays.toString(colors));
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colors).toLowerCase());

        for(int i=0;i<colors.length;i++){

            colors[i]=colors[i].toLowerCase();
        }Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

    }
}
