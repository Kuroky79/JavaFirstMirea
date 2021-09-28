package ru.mirea.task5.opt1;

public class Test {
    public static void main(String[] args) {
        Cup cup = new Cup("Porcelain", 210,300);
        cup.action();
        Plate plate = new Plate("Сlay", 93, "Huge");
        plate.action();
    }
}