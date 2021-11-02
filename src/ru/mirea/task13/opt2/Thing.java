package ru.mirea.task13.opt2;


public class Thing {
    public int id;
    public double price;

    public Thing(){
        id = 0;
        price = 0;
    }

    public Thing(int id, double price){
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Thing is " + id +
                ", price=" + price ;
    }
}