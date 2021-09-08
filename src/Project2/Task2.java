package Project2;


public class Task2 {
    public static void main(String[] args) {


        double quarter = 0.25;
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;
        double dollar1 = quarter * 4;

        double inputQuarter = 5;
        double inputDime = 4;
        double inputNickel = 3;
        double inputPenny = 2;

        double dollarResult = (inputQuarter * quarter) + (inputDime * dime) + (inputNickel * nickel) + (inputPenny * penny);

        System.out.println("If I add up all the change I will get: ");
        System.out.printf("%.2f",dollarResult);

    }
}
