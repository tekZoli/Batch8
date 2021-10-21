package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pracrtice3 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {


        FileInputStream file = new FileInputStream("Test.txt");

        //System.out.println(file);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());


        }


        int a = 15;
        int b =10;

        Thread.sleep(3000);

        System.out.println("After thread sleep");

        if(a<b){
            throw new RuntimeException();

        }
        else if(a>b){
            throw new IndexOutOfBoundsException("You are going out of bound");
        }

        Thread.sleep(3000);

        System.out.println("After thread sleep");



    }
}