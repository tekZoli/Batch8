package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        try{

            FileInputStream file= null;

            file= new FileInputStream("Te.txt");

            //System.out.println(file);

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        }catch (FileNotFoundException exception){

            System.out.println("File not Found");
            System.out.println(Arrays.toString(exception.getStackTrace()));
            System.out.println(exception.getCause());
            System.out.println(exception.getMessage());


        }



        finally {

            System.out.println("This is finally block");
            System.exit(0);
        }



    }
}










