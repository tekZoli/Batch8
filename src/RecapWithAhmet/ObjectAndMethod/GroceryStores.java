package RecapWithAhmet.ObjectAndMethod;

public class GroceryStores {

    int applesPerYear;
    double applePrice;
    int orangesPerYear;
    double orangePrice;

    public GroceryStores(int applesPerYear, double applePrice, int orangesPerYear, double orangePrice) {
        this.applesPerYear = applesPerYear;
        this.applePrice = applePrice;
        this.orangesPerYear = orangesPerYear;
        this.orangePrice = orangePrice;
    }



public void grossRevenue(String city){
double revenue = (applesPerYear*applePrice)+(orangesPerYear*orangePrice);
    System.out.println("The revenue of "+city+" is "+ revenue);
}



}
