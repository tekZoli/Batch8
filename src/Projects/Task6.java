package Projects;

public class Task6 {
    public static void main(String[] args){

        int minutes = 3456789;
        int minHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;
        int minDay = hoursInDay * minHour;
        int minYear = minHour*hoursInDay*daysInYear;
        int remainderMinutes = minutes % minYear;
        int totalYears = (minutes - remainderMinutes)/ minYear;
        int totalDays = remainderMinutes / minDay;
        int leftOverMin = minutes - (minYear * totalYears);

        System.out.println(minutes + " minutes has " + totalYears + " years and " + totalDays + " days");




    }
}
