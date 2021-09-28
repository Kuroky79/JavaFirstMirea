package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String[] args) {
        Author aboba = new Author("Raf", "raf555@mail.ru", 'r');
        System.out.println(aboba.toString());
        System.out.println(aboba.getEmail());
        aboba.setEmail("rafael2_789@mail.ru");
        System.out.println(aboba.getEmail());
    }
}