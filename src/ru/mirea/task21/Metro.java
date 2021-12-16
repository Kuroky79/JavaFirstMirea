package ru.mirea.task21;

import java.util.LinkedList;

public class Metro {
    LinkedList<String> stations;
    Metro(LinkedList<String> l){
        stations = l;
    }
    public void PrintList(Boolean bool){
        for(int i = 0; i < stations.size(); i++){
            if((bool) & (i % 2 == 1)) System.out.println(stations.get(i));
            else if((!bool) & (i % 2 == 0)) System.out.println(stations.get(i));
        }
        System.out.println("\n"); // Вывод в порядке
    }
}

class Main{
    public static void main(String[] args) {
        LinkedList<String> lines= new LinkedList<String>();
        lines.add("Люблино");
        lines.add("Щелковская");
        lines.add("Печатники");
        lines.add("Партизанская");
        lines.add("Кузьминки");
        lines.add("Курская");
        Metro metro = new Metro(lines);
        metro.PrintList(false);
        metro.PrintList(true);
    }
}