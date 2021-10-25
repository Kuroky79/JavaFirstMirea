package ru.mirea.task6.opt2;

public class Blouse implements Priceable{
    private int price;

    public Blouse(int price) {
        this.price = price;
    }

    @Override
    public void getPrice() {
        System.out.println("This Blouse costs: " + price);
    }
}