package Encapsulation;

public class City {

    private String name;
    private int population;
    private int establishmentYear;


    public void setName(String newName){
        name=newName;

    }

    public String getName(){

       return name;
    }

    //do setters and getters for other fields

    public void setPopulation(int newPop){

        population=newPop;
    }

    public int getPopulation(){
        return population;
    }

    public void setEstablishmentYear(int newEstYear){

        establishmentYear=newEstYear;
    }

    public int getEstablishmentYear(){
        return establishmentYear;
    }

}
