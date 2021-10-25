package ru.mirea.task10.opt3;
import java.util.Scanner;

public class er {
    public static void main(String[] args) {
        System.out.println("Input A");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Input B");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();

        if (a<b){
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        }
        else {
            while (a >= b)
            {
                System.out.println(a--);
            }
        }
    }
}