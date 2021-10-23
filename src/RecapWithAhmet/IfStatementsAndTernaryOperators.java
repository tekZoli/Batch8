package RecapWithAhmet;

public class IfStatementsAndTernaryOperators {
    public static void main(String[] args) {


        int a =5;
        int b = 6;
        if(b>a){
            System.out.println("hello");
    }else{
            System.out.println("no");
        }
        int result=(b>a)? 12:5;
        System.out.println((b>a)? "hello":12);
        System.out.println(result);



    }
}