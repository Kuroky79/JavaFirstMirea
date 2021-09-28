package ru.mirea.task4.opt2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball b2 = new Ball(28,-5);
        ball1.setXY(25,40);
        System.out.println(ball1.toString());
        b2.move(3,5);
        ball1.setX(7);
        ball1.setY(-10);
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());
        System.out.println(b2.toString());
    }
}