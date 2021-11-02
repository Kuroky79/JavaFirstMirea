package ru.mirea.task14.opt2;

import java.util.*;

public class Main {
    public static void main(String[]args)
    {
        Queue<Integer> a=new LinkedList();
        Queue<Integer> b=new LinkedList();
        int []c=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("First player cards: ");
        for(int i=0;i<5;i++)
            c[i]=sc.nextInt();
        for (int i=4;i>=0;i--)
            a.add(c[i]);
        System.out.println("Second player cards: ");
        for(int i=0;i<5;i++)
            c[i]=sc.nextInt();
        for (int i=4;i>=0;i--)
            b.add(c[i]);
        boolean fin=false;
        int count=0;
        for (int i=0;i<106;i++) {
            count++;
            if (a.element() == 0 && b.element() == 9) {
                a.add(a.element());
                a.add(b.element());
            } else if (a.element() == 9 && b.element() == 0) {
                b.add(a.element());
                b.add(b.element());
            }
            else if(a.element() > b.element())
            {
                a.add(a.element());
                a.add(b.element());
            }
            if(a.element() < b.element())
            {
                b.add(a.element());
                b.add(b.element());
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