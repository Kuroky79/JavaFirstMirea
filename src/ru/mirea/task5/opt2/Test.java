package ru.mirea.task5.opt2;

public class Test {
    public static void main(String[] args) {
        Bulldog b1 = new Bulldog("Korgi", 7, 150);
        Pudell b2 = new Pudell("Kendi", 8, 142);
        b2.bro();
        b1.info();
        b2.setAge(17);
        b2.setBeautiful(40);
        b2.bro();
    }
}