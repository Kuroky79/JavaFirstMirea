package ru.mirea.task3.opt3;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Толстой Л.Н.", 1863, "Война и мир");
        System.out.println(b1.toString());
        b1.setYear(1866);
        b1.setAuthor("Достоевский Ф.М.");
        b1.setName("Преступление и наказание");
        System.out.println(b1.toString());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getName());
        System.out.println(b1.getYear());
    }
}