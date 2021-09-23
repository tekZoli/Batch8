package Methods;

public class MathTest2 {
    public static void main(String[] args) {

        Math object=new Math();

        object.sum(4,6);
        object.sum(6, 50);

        Math obj1 = new Math();

        obj1.sum(3, 4);

        object.operation("multiply",4,2);

        object.operation("modulus", 20,7);

////////////////////

        int x = object.sum1(1,3,6);

        System.out.println(x+25);

//int w = object.sum(2,3);

//void return type does not return any value

//that's why you cannot store the outcome into any variable




    }
}
