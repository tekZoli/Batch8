package MentoringAhmet;

import java.util.ArrayList;
import java.util.Arrays;

public class InterviewQuestion {
    public static void main(String[] args) {


        String[] array = {"Ahmet", "Diana", "Elvira", "Ramazan", " Mr.Z"};
        String[] array1 = new String[5];

        array1[0] = "Arzu";
        array1[1] = "Nikita";
// array1[2]="Iulia"; error out of bound

        System.out.println(Arrays.toString(array1));
        ArrayList<String> name = new ArrayList<>();
        name.add("Adam");
        name.add("Tuba");
        name.add("Berry");
        name.add("Maksat");
        name.add("Adel");
        name.add("Kana");
        name.add("Bota");
        name.add("Ahmet");


    }

    public static void nameSearch(ArrayList<String> allNames, String name){
        String searchName=name;
        for (int i = 0; i < allNames.size(); i++) {
            if (allNames.get(i).equals(searchName)){
                System.out.println("Your name is there");
                break;
            }else{
                System.out.println("Your name is not there");
            }
        }

    }

}
