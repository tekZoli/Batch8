package Loops;

public class InfiniteLoop {
    public static void main(String[] args) {


        for (; ; ) {
            System.out.println("This is infinite loop");
        }
        //System.out.println(" this is after loop");----this is compile time error
    }
}
