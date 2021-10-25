package ru.mirea.task8.opt1;

public class Rectangle extends Shape{
    int sideA;
    int sideB;

    Rectangle(){
        super();
        int max = 80;
        this.sideA = (int) (Math.random() * ++max);
        this.sideB = (int) (Math.random() * ++max);
    }
}