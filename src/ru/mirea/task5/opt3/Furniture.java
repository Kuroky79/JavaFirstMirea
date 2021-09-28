package ru.mirea.task5.opt3;

public abstract class Furniture {
    int price;
    String material;

    public Furniture(int price, String material) {
        this.price = price;
        this.material = material;
    }
    public void action(){
        System.out.println("Покупка");
    }
}