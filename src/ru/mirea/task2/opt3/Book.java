package ru.mirea.task2.opt3;

public class Book {
    private int page;
    private String name;

    public Book(int page, String name) {
        this.page = page;
        this.name = name;
    }

    public Book(int page) {
        this.page = page;
        this.page = 1;
    }


    public void setPage(int page) {
        this.page = page;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "pages: " + this.page +" name: " + this.name;
    }
    public void print(){
        System.out.println("Name of this book is " + name + " and there are " + page + " pages");
    }

}