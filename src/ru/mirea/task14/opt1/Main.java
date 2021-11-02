package ru.mirea.task14.opt1;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[]args)
    {
        Stack<Integer> a=new Stack();
        Stack<Integer> b=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("First player cards: ");
        for(int i=0;i<5;i++)
            a.add(sc.nextInt());
        System.out.println("Second player cards: ");
        for(int i=0;i<5;i++)
            b.add(sc.nextInt());
        Collections.reverse(a);
        Collections.reverse(b);
        boolean fin=false;
        int count=0;
        for (int i=0;i<106;i++) {
            count++;
            if (a.firstElement() == 0 && b.firstElement() == 9) {
                a.add(a.firstElement());
                a.add(b.firstElement());
            } else if (a.firstElement() == 9 && b.firstElement() == 0) {
                b.add(a.firstElement());
                b.add(b.firstElement());
            }
            else if(a.firstElement() > b.firstElement())
            {
                a.add(a.firstElement());
                a.add(b.firstElement());
            }
            if(a.firstElement() < b.firstElement())
            {
                b.add(a.firstElement());
                b.add(b.firstElement());
            }
            a.remove(0);
            b.remove(0);
            if (a.isEmpty()) {
                System.out.println("Second "+count);
                fin = true;
                break;
            }
            if (b.isEmpty()) {
                System.out.println("First "+count);
                fin = true;
                break;
            }
        }
        if(!fin)
            System.out.println("botva");
    }
}