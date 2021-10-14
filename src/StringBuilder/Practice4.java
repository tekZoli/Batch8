package StringBuilder;

public class Practice4 {

    //create a method that will take a stringbuilder as a parameter, this method will, calculate and return sum of
    //the digits from string-builder object
    //StringBuilder stB={"ud2o3csdfe3435we3dw79dr"};

    public int retSum(StringBuilder stB){
        StringBuilder stb = new StringBuilder("ud2o3csdfe3435we3dw79dr");
        int sum=0;
        for(int i=0; i<stB.length();i++) {
           Character c = stB.charAt(i);

          if(Character.isDigit(c)){
              int number = Integer.parseInt(String.valueOf(c));
              sum = sum+number;
          }
        }
        return sum;
    }

    public static void main(String[] args) {
        Practice4 object = new Practice4();

        StringBuilder stb = new StringBuilder("ud2o3csdfe3435we3dw79dr");

        System.out.println(object.retSum(stb));
    }
}
