package ru.mirea.task6.opt1;

import ru.mirea.task6.opt1.Nameable;

public class Planet implements Nameable {
    String name;
    String color;

    public Planet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void name() {
        System.out.println("Name: " + name + " color: " + color);
    }
}