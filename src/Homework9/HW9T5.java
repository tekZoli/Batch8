package Homework9;

public class HW9T5 {
    public static void main(String[] args) {

        int[] tempF={50,32,45,78,65,90};
        for(int i=0;i<=tempF.length;i++){
            double C=(tempF[i]-32)/1.8;
            System.out.println("Today's temperatuew in Celcius are: "+C);

        }


    }
}
