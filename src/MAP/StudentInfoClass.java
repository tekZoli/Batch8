package MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentInfoClass {
    public static void main(String[] args) {


    /*
    StudentInfo
-------------
FirstName: David
LastName: Pena
Age: 25
Gender: M
City: Chicago

FirstName: Jeremiah
LastName: Michaelson
Age: 15
Gender: M
City: HighPark

FirstName: Michael
LastName: White
Age: 35
Gender: M
City: Winnetka

FirstName: Sarah
LastName: Star
Age: 29
Gender: F
City: Chicago
     */

        HashMap <String, String> stu1 = new HashMap();
        stu1.put("FirstName", "David");
        stu1.put("LastName", "Pena");
        stu1.put("Age", "25");
        stu1.put("Gender", "M");
        stu1.put("City", "Chicago");

        HashMap<String, String> stu2 = new HashMap<>();
        stu2.put("FirstName", "Jeremiah");
        stu2.put("LastName", "Michaelson");
        stu2.put("Age", "15");
        stu2.put("Gender", "M");
        stu2.put("City", "HighPark");

        HashMap <String, String> stu3 = new HashMap<>();
        stu3.put("FirstName", "Michael");
        stu3.put("LastName", "White");
        stu3.put("Age", "18");
        stu3.put("Gender", "M");
        stu3.put("City", "Winnetka");

        HashMap <String, String> stu4 = new HashMap<>();
        stu4.put("FirstName", "Sarah");
        stu4.put("LastName", "Star");
        stu4.put("Age", "29");
        stu4.put("Gender", "F");
        stu4.put("City", "Chicago");

        List<HashMap<String, String>> sl = new ArrayList();
        sl.add(stu1);
        sl.add(stu2);
        sl.add(stu3);
        sl.add(stu4);

        System.out.println(sl);
        // if students names is les than 20 print out their name

        for(int i = 0; i<sl.size();i++){
            if(Integer.parseInt(sl.get(i).get("Age"))<20){
                System.out.println(sl.get(i).get("FirstName"));
            }
        }

        //print out elements from map, as pairs, key-value

        for (int i = 0; i < sl.size(); i++) {

            System.out.println(sl.get(i).entrySet());
        }
        //if students city is chicago,
        int count=0;
        for (int i = 0; i <sl.size(); i++) {
            if(sl.get(i).get("City").equals("Chicago")){
                System.out.println(sl.get(i).get("FirstName").concat("chicago@gmail.com"));

            }
        }
        count++;
        System.out.println(count);
    }
}
