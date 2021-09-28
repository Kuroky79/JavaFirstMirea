package ru.mirea.task2.opt3;

public class Book {
    private String name;
    private int value;
    public Book (String n, int v) {
        name = n;
        value = v;
    }
    public Book (String s) {
        name = s;
        value = 0;
    }
    public Book() {
        name = "small";
        value = 0;
    }
    public void setValue(int value){
        this.value = value;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName (String name){
        return name;
    }

    public int getValue() {
        return value;
    }
    public String toString(){
        return this.name+" , value "+this.value;
    }
    public void lograms(){
        System.out.println(name+" 'value in kilograms is "+value*7);
    }
}