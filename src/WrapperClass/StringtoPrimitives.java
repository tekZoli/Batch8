package WrapperClass;

public class StringtoPrimitives {
    public static void main(String[] args) {


        String str1 ="123";
        //int i = str1;

        int i = Integer.parseInt(str1);

        Integer i1 = new Integer(str1);
        System.out.println(i1*2);

        double db1 = Double.parseDouble(str1);

        String str2 = "true";

        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

        boolean b2 = Boolean.parseBoolean(str1);
        System.out.println(b2);

        boolean b3 = Boolean.parseBoolean("False");
        System.out.println(b3);

        String str3 = "A";

        ///Character.parse------> cannot convert, no parse method for Charachter



    }
}