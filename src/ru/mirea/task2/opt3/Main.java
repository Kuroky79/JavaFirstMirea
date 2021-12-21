package ru.mirea.task2.opt3;


public class Main {

    public static void main(String[] args) {
        Book b1 = new Book(3, "book one");
        Book b2 = new Book(41, "book two");
        Book b3 = new Book(93, "book three");
        b3.setPage(130);
        b1.print();
        b2.print();
        b3.print();
        System.out.println(b1);

    }
}