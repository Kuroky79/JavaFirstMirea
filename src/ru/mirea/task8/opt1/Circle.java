package ru.mirea.task8.opt1;

public class Circle extends Shape{
    int radius;
    Circle(){
        super();
        int max = 50;
        this.radius = (int) (Math.random() * ++max);
    }
}