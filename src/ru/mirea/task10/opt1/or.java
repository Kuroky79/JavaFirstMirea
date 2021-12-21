package ru.mirea.task10.opt1;

public class or {
    public static void main(String[] args) {
        or rec = new or();
        rec.printNumbers(4);
    }

    public void printNumbers(int n){
        if (n == 0)
            return;
        printNumbers(n - 1);
        for (int i = 1; i <= n; ++i) {
            System.out.print(n + " ");
        }
        System.out.println();

    }
}