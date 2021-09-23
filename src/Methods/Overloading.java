package Methods;

public class Overloading {

    //create a method that will take two double parameters
    //this method will be named as areaCalculator
    //it will return the area of rectangle
    //formula A = length * width
    int sum;

    public double areaCalculator(double length, double width){
           //sum=length*width;
        double area = length*width;
        //return length*width; ----- is also cool
        return area;
    }


        //calculate the area for a square
        //formula >>A=l*l

        public double areaCalculator ( double length){

            double area = length * length;
            return area;
        }


        public double areaCalculator ( int length){

            //double area = length*length;
            return 3.5;
        }

    public double areaCalculator ( String length){

        //double area = length*length;
        return 3.5;
    }


    public static void main(String[] args) {
        Overloading object = new Overloading();
        System.out.println(object.areaCalculator(1.2, 3.4));

        double area = object.areaCalculator(3, 4.5);

        System.out.println(area);

        object.areaCalculator("String");
        object.areaCalculator(4.6);
        object.areaCalculator(2.3, 1.3);

    }
}
