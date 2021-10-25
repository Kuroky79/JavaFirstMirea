package ru.mirea.task8.opt1;

import java.util.Random;

public abstract class Shape {
    int x;
    int y;
    float r, g, b;

    Shape(){
        Random rand = new Random();
        int max = 500;
        this.x = (int) (Math.random() * ++max);
        this.y = (int) (Math.random() * ++max);
        this.r = rand.nextFloat();
        this.g = rand.nextFloat();
        this.b = rand.nextFloat();
    }
}