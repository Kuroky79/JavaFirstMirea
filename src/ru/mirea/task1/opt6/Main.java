package ru.mirea.task1.opt6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round((Math.random() * 10));
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
        System.out.println("Sorted array is: ");

        boolean Sorted = false;
        int buf;
        while(!Sorted) {
            Sorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    Sorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}