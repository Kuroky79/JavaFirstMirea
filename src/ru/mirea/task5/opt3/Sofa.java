package ru.mirea.task5.opt3;

public class Sofa extends  Furniture{
    int seats;

    public Sofa( String material, int weight, int price, int seats) {
        super(material, weight, price);
        this.seats = seats;
    }
    public void info() {
        System.out.println("It is " + getMaterial() + " sofa " + "weight is " + getWeight() + " on " + seats + " seats " + " and price is " + getPrice());
    }
}