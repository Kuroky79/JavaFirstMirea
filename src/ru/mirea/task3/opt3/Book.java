package ru.mirea.task3.opt3;

public class Book {
    String Author;
    int year;
    String name;

    public Book(String author, int year, String name) {
        Author = author;
        this.year = year;
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}