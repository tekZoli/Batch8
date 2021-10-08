package HomeWork7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
            String username = "username";
            int password = 123456;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username");
        String un = scan.nextLine();
        System.out.println("Please enter your password");
        int ps= scan.nextInt();
        int counter=3;
        do{
            if(username.equals(un) && password==ps){
                System.out.println("You have succesfully logged in");
                break;

            }else{
                counter--;
                System.out.println("Please try again, you have "+counter+" tries left");
             scan.nextLine();
             scan.nextInt();
                    if (counter==0){
                        System.out.println("You have no more tries left");
                    }
            }


        }while(counter!=0);



    }
}
