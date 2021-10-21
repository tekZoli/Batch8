package Exception;

public class Practice1 {
    public static void main(String[] args) {
        int a =9;

        System.out.println("This is my first print before exeption");


        try{
           String str = "35c";//NumberFormatExeption
//            int number =Integer.parseInt(str);//saying the format is not matching
//            System.out.println(number);

            String sub = str.substring(5);//second blockage is not reached
        }catch (IllegalArgumentException exception){

            a=5;
            int number2 = 25;//coding inside the catch is useful and usable
            System.out.println("This is inside of CATCH block");


        }catch(IndexOutOfBoundsException exeption2){
            System.out.println("This is my second EXEPTION");
        }
        try{
            String str = "35c";
            String sub = str.substring(5);//second blockage is not reached
        }catch(IndexOutOfBoundsException exeption){
            System.out.println("THis is my second try catch block");
        }


//        String str = "35c";//NumberFormatExeption
//        int number =Integer.parseInt(str);//saying the format is not matching
//        System.out.println(number);

        System.out.println("This is my print AFTER the exeption");
    }
}