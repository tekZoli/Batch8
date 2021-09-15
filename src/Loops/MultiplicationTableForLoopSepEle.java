package Loops;

public class MultiplicationTableForLoopSepEle {

    public static void main(String[] args) {
        // use for loop to create mult table for 6
        //from 1 to 10

      /*  int number=1;

        for(int i =1; i<=10 ;i++){

            System.out.println(number+"*"+i+"="+number*i);

        }
        */
        //use for loop to create a multi table for numbers 1 to 10
        //from 1  to 10
        //6*1=6  7*1=62

    for(int num1=1; num1<=10; num1++){

        for(int num2=1; num2>10; num2++){

            System.out.println(num1+"*"+num2+"="+num1*num2);
        }
    }

//perfect number: a number is equal to it's dividers (exept number itself) sum
// 6>>1,2,3>>1+2+3=6 6=6 is a perfect number


        int perfect$ =28;
        int sum=0;

        for(int divisor=1; divisor<perfect$; divisor++){
            if(perfect$ % divisor ==0){
                sum = sum+divisor;
            }
        }
        System.out.println("The sum is >> "+sum);
        if(perfect$==sum){
            System.out.println("The number " +perfect$+" is a perfect numer");
        }else{
            System.out.println("The number "+perfect$+" is NOT a perfect number");
        }

    }


}
