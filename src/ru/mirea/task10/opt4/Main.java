package ru.mirea.task10.opt4;

import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        function();
    }
    static void function()
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int max=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)>max)
                max = s.charAt(i);
        }
        System.out.println((char)max);
    }
}