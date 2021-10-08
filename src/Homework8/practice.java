package Homework8;

public class practice {
    public static void main(String[] args) {
        String str="aaacodebbb";
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==('c')&&str.charAt(i+1)==('o')&&str.charAt(i+3)=='e'){
                count++;
            }

        }
        System.out.println(count);

    }
}
