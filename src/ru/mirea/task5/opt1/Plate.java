package ru.mirea.task5.opt1;

public class Plate extends Dish{
    String size;

    public Plate(String material, int price, String size) {
        super(material, price);
        this.size = size;
    }

}