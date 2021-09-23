package Methods;

public class Math {

    //crete a method that will add to intiger numbers and will show the sum

    public void sum(int a, int b){

        //int a=2;
        //int b=3;
        int sum=a+b;
        System.out.println("the sum of "+a+" and "+b+" is "+sum);

    }

    public int sum1(int a, int b, int c){

        //int a=2;
        //int b=3;
        int sum=a+b+c;
        System.out.println("the sum of "+a+" and "+b+" is "+c+"  "+sum);
        return sum;
    }



//-create a method that will take string parameter for
//-the name of the operation and two other parameters
//-as int data type
//-this method will print according to the provided
//-operation

    public void operation(String operation, int a, int b){

        switch (operation){

            case "add":
                System.out.println("The sum is "+(a+b));
                break;
            case "substarct":
                System.out.println("The sum is "+(a-b));
                break;
            case "multiply":
                System.out.println("The sum is "+(a*b));
                break;
            case "divide":
                System.out.println("The sum is "+(a/b));
                break;
            case "modulus":
                System.out.println("The sum is "+(a%b));
                break;
            default:
                System.out.println("Opertion shpuld be: add/substract/multiply/modulus");
        }


    }



}
