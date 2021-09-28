package ru.mirea.task3.opt1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10,-10,10);
        circle1.setRadius(10);
        circle1.setX(-5);
        circle1.setY(-1);
        System.out.println(circle1.getX());
        System.out.println(circle1.getY());
        System.out.println(circle1.getRadius());
    }
}