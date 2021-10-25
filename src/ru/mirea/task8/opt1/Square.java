package ru.mirea.task8.opt1;

public class Square extends Shape{
    int side;

    Square(){
        super();
        int max = 100;
        this.side = (int) (Math.random() * ++max);
    }
}