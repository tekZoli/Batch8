package Blocks;

public class Practice {

    int number;
    static int id;



    {
       number=99;
        System.out.println("Instance block");
    }


    static{
        id=25;
        System.out.println("Static block");
    }



}
