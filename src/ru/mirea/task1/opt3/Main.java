package ru.mirea.task1.opt3;

public class Main {
    public static void main(String[] args) {
        int [] A = {45,6,8,263,49,428,21,125,30,6,28};
        int SUM = 0;
        for(int i = 0; i < 10; i++)
            SUM+=A[i];
        System.out.println(SUM);
        SUM = 0;
        int i = 0;
        while(i < 10){
            SUM+=A[i];
            i++;
        }
        System.out.println(SUM);
        i = 0;
        SUM = 0;
        do {
            SUM+=A[i];
            i++;
        }while(i <=9);
        System.out.println(SUM);
    }
}