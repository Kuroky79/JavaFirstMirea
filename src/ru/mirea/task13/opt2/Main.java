package ru.mirea.task13.opt2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int size = 3;
        LinkedList<Thing> ar = new LinkedList<Thing>();

        Thing itemForRemove = new Thing();

        for (int i = 0; i < size + 1; ++i) {
            Thing item = new Thing(i, Math.random() * 10);
            ar.add(item);
            itemForRemove = item;
        }
        ar.remove(itemForRemove);

        for (int i = 0; i < size -1; ++i){
            System.out.println(ar.get(i));
        }

        System.out.println(ar.get(2));
    }
}