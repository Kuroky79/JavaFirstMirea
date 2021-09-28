package ru.mirea.task2.opt2;

public class Test {
    public static void main(String[] args) {
        Ball ball1 = new Ball(48,5);
        System.out.println(ball1.toString());
        ball1.setSize(30);
        System.out.println(ball1.toString());
    }
}