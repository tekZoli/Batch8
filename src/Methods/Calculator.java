package Methods;

public class Calculator {

    // one method with public access modifier nad call in this class
    //we should find one int parameter and we should find square of the parameter and return it

    public static int findSquare(int square){
        return square*square;
    }
    public long findSquare(long square){
        return square*square;
    }
    // since we are in the same class we can just call with the method name;
    public static void main(String[] args) {
        System.out.println(findSquare(21));
    }

}
