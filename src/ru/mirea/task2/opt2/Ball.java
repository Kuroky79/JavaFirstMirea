package ru.mirea.task2.opt2;

public class Ball {
    int size;
    int type;

    public Ball(int size, int type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", type=" + type +
                '}';
    }
}