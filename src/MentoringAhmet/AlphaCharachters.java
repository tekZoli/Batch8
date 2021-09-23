package MentoringAhmet;

import java.nio.ReadOnlyBufferException;

public class AlphaCharachters {

    public static void main(String[] args) {

        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String OnlyAlphabets="";
        String Onlydigits="";
        String OnlySpecial="";
        for(int i =0; i<given.length();i++){
            char ch=given.charAt(i);
            if(Character.isAlphabetic(ch)&&!Character.isDigit(ch)){
                OnlyAlphabets+=ch;
            }else if(!Character.isAlphabetic(ch)&&Character.isDigit(ch)){
                Onlydigits+=ch;

            }else{
                OnlySpecial+=ch;

            }
        }
    }
}
