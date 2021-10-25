package ru.mirea.task10.opt2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n + 1; i++) {
            System.out.println(i);
        }

    }
}