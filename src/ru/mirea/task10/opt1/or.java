package ru.mirea.task10.opt1;
import java.util.Scanner;

public class or
{
    public void rec()
    {
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();
        if ((number % 2) == 1)
        {
            System.out.println(number);
            rec();
        }
        else
        if (number != 0)
            rec();
    }

    public static void main(String[] args)
    {
        or obj = new or();
        obj.rec();
    }
}