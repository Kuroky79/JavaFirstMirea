package ru.mirea.task1.opt4;
import java.util.Random;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        int[] massive = new int[10];
        Random rand = new Random();
        int duty;
        for (int i = 0; i < 10; i++)
        {
            massive[i] = rand.nextInt();
        }
        System.out.println("Generated by class Random: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print( massive[i] + " " );
        }
        for (int i = 0; i < 10; i++)
        {
            for(int j = i; j < 10; j++)
            {
                if (massive[i] > massive[j])
                {
                    duty = massive[i];
                    massive[i] = massive[j];
                    massive[j] = duty;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted massive by class Random: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print( massive[i] + " " );
        }
        System.out.println();

        for (int i = 0; i < 10; i++)
        {
            massive[i] = -2147483648 + (int) (Math.random() * 2147483647);
        }
        System.out.println("Generated by Math.random(): ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print( massive[i] + " " );
        }
        for (int i = 0; i < 10; i++)
        {
            for(int j = i; j < 10; j++)
            {
                if (massive[i] > massive[j])
                {
                    duty = massive[i];
                    massive[i] = massive[j];
                    massive[j] = duty;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted massive by Math.random(): ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print( massive[i] + " " );
        }
    }
}