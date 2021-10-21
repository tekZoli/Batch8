package RecapWithAhmet.ObjectAndMethod;

public class GroceryStoreTest {
    public static void main(String[] args) {

        GroceryStores houstonStore= new GroceryStores(534,0.99, 429, 0.87);
        GroceryStores seattleStore = new GroceryStores(765, 0.86, 842, 0.91);

       houstonStore.applesPerYear=534;
        houstonStore.applePrice=0.99;
        houstonStore.orangesPerYear=429;
        houstonStore.orangePrice=0.87;
        System.out.println("Houston Store: ");
        System.out.println("Apples sold - "+ houstonStore.applesPerYear);
        System.out.println("Apples retail cost - "+ houstonStore.applePrice);

        System.out.println("Oranges retail cost - "+ houstonStore.orangePrice);
        System.out.println("Orenges sold per Year - "+ houstonStore.orangesPerYear);

        seattleStore.applesPerYear=765;
        seattleStore.applePrice=0.86;
        seattleStore.orangesPerYear=842;
        seattleStore.orangePrice=0.91;

        System.out.println("Seattle Store: ");
        System.out.println("Apples sold - "+ seattleStore.applesPerYear);
        System.out.println("Apples retail cost - "+ seattleStore.applePrice);

        System.out.println("Oranges retail cost - "+ seattleStore.orangePrice);
        System.out.println("Orenges sold per Year - "+ seattleStore.orangesPerYear);

        houstonStore.grossRevenue("Houston");
        seattleStore.grossRevenue("Seattle");




    }
}
