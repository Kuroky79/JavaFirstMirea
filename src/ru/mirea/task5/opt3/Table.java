package ru.mirea.task5.opt3;

public class Table extends Furniture{
    int height;

    public Table(String material, int weight, int price, int height) {
        super(material, weight, price);
        this.height = height;
    }
    public void info() {
        System.out.println("It is " + getMaterial() + " chair " + "weight is "
                + getWeight() + " height is " + height + " and price is " + getPrice());
    }
}