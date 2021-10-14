package HomeWorkPractice;

public class ReverseString {
    public static void main(String[] args) {

        String toRev = "Hello Genius!";
        String reverse="";

        for (int i = toRev.length()-1; i >=0; i--) {
            reverse=reverse+toRev.charAt(i);
            //System.out.println(reverse);
        }
     System.out.println(reverse);



    }
}
