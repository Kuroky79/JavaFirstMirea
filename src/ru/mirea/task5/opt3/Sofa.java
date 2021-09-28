package ru.mirea.task5.opt3;

public class Sofa extends Furniture{
    int size;

    public Sofa(int price, String material, int size) {
        super(price, material);
        this.size = size;
    }
    public void action(){
        System.out.println("Lie down");
    }
}