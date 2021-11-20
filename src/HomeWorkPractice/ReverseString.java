package HomeWorkPractice;

public class ReverseString {
    public static void main(String[] args) {
//
//        String toRev = "Hello Genius!";
//        String reverse="";
//
//        for (int i = toRev.length()-1; i >=0; i--) {
//            reverse=reverse+toRev.charAt(i);
//            //System.out.println(reverse);
//        }
//     System.out.println(reverse);


//    String str = "Hello night";
//    String reverse = "";
//
//        for (int i = str.length()-1;i>=0; i--){
//            reverse=reverse+str.charAt(i);
//        }
//        System.out.println(reverse);
//








        String toRev = "Hello Genius!";
        String reversed = "";

        for (int i =toRev.length()-1; i >=0 ; i--) {
            reversed+=toRev.charAt(i);
        }
        System.out.println(reversed);

        StringBuilder builder =new StringBuilder(toRev);
        System.out.println(builder.reverse());






    }
}
