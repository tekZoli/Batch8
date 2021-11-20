package Homework8;

public class HW11 {
    public static void main(String[] args) {

    /*
    Write a program in Java to find the sum of the series 1 +11 + 111 +
1111 + .. n terms.
Test Data :
Input the number of terms : 5
Expected Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
     */
        int input=5;
        int sum=0;
        int one=1;

        for(int i = 0; i <input; i++){
            System.out.print(one+"+");
            sum=one+sum;
            one=(one*10)+1;
        }System.out.println(sum);


    }
}
