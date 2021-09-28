package ru.mirea.task8.opt2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите путь до изображения");
        Scanner scanner = new Scanner(System.in);
        String src = scanner.nextLine();
        Window w = new Window();
        w.loadImage(src);
        w.drawIcon();
    }
}