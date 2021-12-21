package ru.mirea.task19;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws TriangleException {
        int a = 0, b = 0, c = 0;
        System.out.println("Input triangle.");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a + b + c == 180){
            System.out.println("Triangle exist.");
        } else {
            throw new TriangleException("Triangle doesn't exist.");
        }
    }

}

class TriangleException extends Exception {

    public TriangleException (String message) {
        super(message);
    }
}