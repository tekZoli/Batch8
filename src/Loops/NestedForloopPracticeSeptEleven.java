package Loops;

public class NestedForloopPracticeSeptEleven {

    public static void main(String[] args) {

        /*
        create a doigital clock that prints hours and minutes
        hours from 0 to 12
        minutes from 0 to 59

         */
        for (int a = 0; a < 2; a++) {
            LABEL:
            for (int hour = 0; hour < 12; hour++) {
                if(hour>=5 && hour<=7){
                    continue;
                }if(a==0){
                    continue;
                }
                //if(hour>=10)
                 // break;

                for (int minutes = 0; minutes < 60; minutes++) {
                    if (a == 0){
                        System.out.println(hour + " : " + minutes + " am");
                        if(a==0){
                            continue;
                        }
                    }
                    if(hour==10 ||hour==11){
                        break LABEL;
                    }
                    else {
                        System.out.println(hour + " : " + minutes + " pm");
                    }
                }
            }
        }
//        for (int hour=0; hour<12; hour++){
//
//            for (int minutes = 0; minutes<60; minutes++){
//
//                System.out.println(hour +" : "+ minutes + " pm");
//            }
//        }

    }
}