package ru.mirea.task5.opt1;

public class Cup extends Dish{
    int volume;

    public Cup(String material, int price, int volume) {
        super(material, price);
        this.volume = volume;
    }
    public void action(){
        System.out.println("Drink");
    }
}