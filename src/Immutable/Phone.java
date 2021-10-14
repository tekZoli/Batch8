package Immutable;

import jdk.nashorn.internal.ir.annotations.Immutable;

public class Phone {

    private String brand = "Iphone";
    private double price;
    private String color;
    private double size;

    public Phone(){}

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    public double getSize(){
        return size;
    }

    private void call(){
        System.out.println("Calling a friend"+color);
    }




}
