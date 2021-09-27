package Constructor;

public class CarTest {
    public static void main(String[] args) {
        Car mine= new Car("Lexus");

        Car mine2 = new Car("Lexus");
        Car mine3 = new Car("Lexus");
        Car mine4 = new Car("BMW");

        Car mine5 = new Car("");
        Car mine6 = new Car("BMW");
        Car mine7 = new Car("Lexus");

        String str = "Test";
        String str2 = "Test";
        String str3 = new String("Test");
        String str4 = new String("Test");


        mine=null;
        System.out.println(mine4);

        //System.gc();

        //equals() and ==

        System.out.println(mine2.equals(mine3));
        System.out.println(mine2==mine3);

        System.out.println(str.equals(str2));
        System.out.println(str==str2);

        System.out.println(str.equals(str3));

        System.out.println(str3.equals(str4));
        System.out.println(mine3.equals(mine7));

        System.out.println(mine5.equals(mine7));
    }

}
