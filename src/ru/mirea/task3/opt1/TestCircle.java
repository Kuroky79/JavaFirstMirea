package ru.mirea.task3.opt1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10,-10,10);
        circle1.setRadius(10);
        circle1.setX(-5);
        circle1.setY(-1);
        System.out.println("Circle x coordinate" +  " " +circle1.getX());
        System.out.println("Circle y coordinate" +  " " +circle1.getY());
        System.out.println("Circle radius" + " " +circle1.getRadius());
    }
}