package Homework12;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Time {



    /* Create a class with the name Time. The class needs to have 5
fields (instance variables) with the names hour, minute, second,
month, and year.
Write the following constructor:
1- Create the three-argument constructor to set the values for
hour, minutes, and second
2- Create a two-argument constructor to set the values for month
and year
3- Create five argument constructor to set the values for hour,
minutes, second, month, and year. */

        double hour;
        double minute;
        double second;
        int month;
        int year;

        public Time(){

        }

        public Time(double second, double minute, double hour) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public Time(int month, int year) {
            this.month = month;
            this.year = year;
        }

        public Time(double hour, double minute, double second, int month, int year) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.month = month;
            this.year = year;

/*Create the following instance methods for the Time class:
1- Create one method named getHour. This method needs to return
the hour from the instance field.
2-  Create one method named getMinute. This method needs to return
the minute from the instance field.
3- Create one method named getSecond. This method needs to return
the second from the instance field.
4- Create one method named getMonth. This method needs to return
the Month from the instance field.
5- Create one method named getYear This method needs to return the
Year from the instance field*/
        }

        public double getHour() {
            return hour;
        }

        public double getMinute() {
            return minute;
        }

        public double getSecond() {
            return second;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;

        }

/* Create the following instance methods for the Time class:
1-  Create one method named setHour, it needs to set the value of the
hour field. If the value of the hour is less than 0 and more than equals
24, the value of the hour must set to 0.
2- Create one method named setMinute, it needs to set the value of
the minute field. If the value of the minute is less than 0 and more than
equals 60, the value of the minute must set to 0.
3- Create one method named setSecond, it needs to set the value of
the second field. If the value of the second is less than 0 and more
than equals 60, the value of the second must set to 0.
 */

        public double setHour() {

            if (hour < 0 && hour >= 24) {
                return 0;
            }
            return hour;
        }

        public double setMinute() {
            if (minute < 0 && minute >= 60) {
                return 0;
            }

            return month;
        }

        public double setSeconds() {
            if (second < 0 && second >= 60) {
                return 0;
            }
            return second;
        }

        public int setMonth(){
            if(this.month<0 && this.month>=12){
                return 0;
            }
            return month;
        }
        public int setYear(){
            if(this.month<0){
                return 0;
            }
            return year;
        }
        public void getTime(int hour){
            if(hour<12){
                System.out.println(hour+"AM");
            }else if(hour>12&&hour<24){
                System.out.println(hour+"PM");
            }
        }

    public String seasons(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";

            case 9:
            case 10:
            case 11:
                return "Fall";
            default:
                System.out.println("Invalid entry");
                break;
        }
        return null;
    }

    public void printTime(){
        System.out.println("Text format "+hour+"/"+minute+"/"+second);
    }
    public void printDate(){
        System.out.println("Text format: "+month+"/"+year);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                "/ minute=" + minute +
                "/ second=" + second +
                "- month=" + month +
                "/ year=" + year +
                '}';
    }

    public void instrutions(){
        System.out.println("press 1 to create Time");
        System.out.println("press 2 to create Date");
        System.out.println("press 3 to create a Date and time");
        System.out.println("press 4 to update Time");
        System.out.println("press 5 to update Date");
        System.out.println("press 6 to print Time information");
        System.out.println("press 7 to print Date information");
        System.out.println("press 8 to print Data and Time information");
        System.out.println("press 9 to exit");

    }


}



