package Project3;

public class Middleword {
    public static void main(String[] args) {

        String x = "I love Java";

        String word1 = x.substring(0, x.indexOf(" ")).trim();

        System.out.println(word1);

        x = x.substring(x.indexOf(" ")).trim();

        System.out.println(x);

        String word2 = x.substring(0, x.indexOf(" ")).trim();

        System.out.println(word2);

        x = x.substring(x.indexOf(" ")).trim();

        System.out.println(x);
























        /*
        String sub = x.substring(x.indexOf(" "), x.indexOf(" ", x.indexOf(" ")+1));
        System.out.println(sub);
        String sub=x.substring(x.indexOf(" "));
        sub=x.substring(x.indexOf(" "));
       String sub2=sub.substring(x.indexOf(" "));
        System.out.println(sub);
        System.out.println(sub2);
        */
    }
}
