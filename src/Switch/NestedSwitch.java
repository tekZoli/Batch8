package Switch;

import java.util.Locale;
import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        /*
        you are making a call to a company
        there are three dept's IT-01 HR-2, REP-3
        in the IT dept we have Raj, Alex, Jesse
       in the HR, Anna, Tima
       in the REP, Jeremiah, John, David
       ask user which "department they want to talk to"
       after they choose the dept ask them who do they want to talk with
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which department do you want to talk to? 1-IT, 2-HR, 3-REP");

       int department = scanner.nextInt();

        switch (department){

            case 1: scanner = new Scanner(System.in);//IT Department
                System.out.println("Who do you want to talk with? Raj, Alex, Jesse");
                String name = scanner.nextLine();
                switch(name.toLowerCase()){
                    case "raj":
                        System.out.println("Transferring to Raj");
                        break;
                    case "Alex":
                        System.out.println("Transferring to Alex");
                        break;
                    case "Jesse":
                        System.out.println("Transferring to Jesse");
                        break;
                    default:
                        System.out.println("invalid selection");
                        break;
                }
                break;

            case 2 : scanner = new Scanner(System.in);
                System.out.println("Who do you want to talk with? Ana or Tima");
                String hrName = scanner.nextLine().toLowerCase().trim();

                switch(hrName){
                    case "ana":
                        System.out.println("Transferring to Ana");
                        break;
                    case "tima":
                        System.out.println();
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;

                }
                break;

            case 3: scanner = new Scanner(System.in);
                System.out.println("Who do you want to talk with? Jeremiah, John, David");
                String repName = scanner.nextLine().toUpperCase();
                switch(repName){
                    case "JEREMIAH":
                        System.out.println("Transferring to Jeremiah");
                        break;
                    case "John":
                        System.out.println("Transferring to John");
                        break;
                    case "David":
                        System.out.println("Transferring to David");
                        break;


                }
                break;

            default:
                System.out.println("There is no such department");



        }





    }
}
