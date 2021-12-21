package ru.mirea.task2.opt4;


public class Main {

    public static void main(String[] args) {
        Dog bulldog = new Dog("Joy", 1, 3);
        System.out.println(bulldog);
        bulldog.toHumanAge();
        Dog poodel = new Dog("Genry", 7, 9);
        System.out.println(poodel);
        poodel.toHumanAge();
    }
}