package ru.mirea.task2.opt1;

public class Shape {
    String name;
    int type;

    public Shape(String name, int type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}