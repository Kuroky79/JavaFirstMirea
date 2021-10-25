package ru.mirea.task6.opt2;

public class Trousers implements Priceable {
    private int price;

    public Trousers(int price) {
        this.price = price;
    }
    @Override
    public void getPrice() {
        System.out.println("This Trousers costs: " + price);
    }
}