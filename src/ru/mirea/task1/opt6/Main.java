package ru.mirea.task1.opt6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
        int [] A = new int[10];
        int [] B = new int[10];
        for (int i = 0; i < 10; i++){
            A[i] = (int)(Math.random() * 5005 + B[i]);
            B[i] = random.nextInt(5023 + A[i]);
        }
        int sA = 0, sB = 0;

        for (int i = 0; i < 10; i++){
            sA += A[i];
            sB += B[i];
        }
        System.out.println(sA);
        System.out.println(sB);
    }
}