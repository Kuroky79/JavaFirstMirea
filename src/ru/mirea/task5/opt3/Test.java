package ru.mirea.task5.opt3;

public class Test {
    public static void main(String[] args) {
        Sofa sofa = new Sofa("leather", 60, 920, 6);
        sofa.info();
        Table chair = new Table("wood", 15, 655, 120);
        chair.info();
    }
}