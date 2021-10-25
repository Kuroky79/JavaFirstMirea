package ru.mirea.task8.opt1;

public class Oval extends Shape{
    int width;
    int height;

    Oval(){
        super();
        int max = 80;
        this.width = (int) (Math.random() * ++max);
        this.height = (int) (Math.random() * ++max);
    }
}