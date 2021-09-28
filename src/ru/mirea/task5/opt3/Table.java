package ru.mirea.task5.opt3;

public class Table extends Furniture{
    int height;

    public Table(int price, String material, int height) {
        super(price, material);
        this.height = height;
    }
    public void action(){
        System.out.println("Sat down");
    }
}