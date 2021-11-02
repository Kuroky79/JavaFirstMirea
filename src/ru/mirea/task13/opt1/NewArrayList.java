package ru.mirea.task13.opt1;

import java.util.ArrayList;

public class NewArrayList {
    public static void main(String[] args) {
        int size = 5;
        ArrayList<Thing> ar = new ArrayList<Thing>(size);

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