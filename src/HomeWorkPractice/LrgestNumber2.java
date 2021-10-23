package HomeWorkPractice;

public class LrgestNumber2 {
    public static void main(String[] args) {
//
//        int[] array = {100, 300, 200, 450, 350};
//
//        int largestNum = 0;
//
//        int secLargestnum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] > array[i]) {
//                    largestNum=array[j];
//                    secLargestnum=array[i];
//                }
//            }
//
//        }
//
//        System.out.println("The largest number is: "+largestNum+" and the second largest number is: "+secLargestnum);



        int[] array = {12 ,13 ,15 ,12 ,0, -1};
        
        int lN= 0;
        int sLN=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    lN=array[j];
                    sLN=array[i];
                }

            }
            
        }
        System.out.println(sLN+" "+lN);

    }


}
