package ru.mirea.task14.opt3;

import java.util.*;

public class Main {
    public static void main(String[]args)
    {
        Deque<Integer> a=new ArrayDeque<>();
        Deque<Integer> b=new ArrayDeque<>();
        int []c=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("First player cards: ");
        for(int i=0;i<5;i++)
            a.addFirst(sc.nextInt());
        System.out.println("Second player cards: ");
        for(int i=0;i<5;i++)
            b.addFirst(sc.nextInt());
        boolean fin=false;
        int count=0;
        for (int i=0;i<106;i++) {
            count++;
            if (a.element() == 0 && b.element() == 9) {
                a.addLast(a.element());
                a.addLast(b.element());
            } else if (a.element() == 9 && b.element() == 0) {
                b.addLast(a.element());
                b.addLast(b.element());
            }
            else if(a.element() > b.element())
            {
                a.addLast(a.element());
                a.addLast(b.element());
            }
            if(a.element() < b.element())
            {
                b.addLast(a.element());
                b.addLast(b.element());
            }
            a.remove();
            b.remove();
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