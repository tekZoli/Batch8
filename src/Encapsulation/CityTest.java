package Encapsulation;

public class CityTest {
    public static void main(String[] args) {
        City city = new City();

        city.setName("Chicago");
        city.setPopulation(233_448);
        city.setEstablishmentYear(1234);

        System.out.println("The name of the city is: "+city.getName());
        System.out.println("This city was etablished in: "+city.getEstablishmentYear());
        System.out.println("The population of the city is: "+city.getPopulation());







    }



}
