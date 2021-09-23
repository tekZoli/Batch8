package Methods;

public class Test1 {
    public static void main(String[] args) {


        //calling interger parqamerter static
        Calculator.findSquare(5);
        long longNumber=9777;
        Calculator calculatorObject=new Calculator();
        calculatorObject.findSquare(longNumber);
        calculatorObject.findSquare(2);
    }
}