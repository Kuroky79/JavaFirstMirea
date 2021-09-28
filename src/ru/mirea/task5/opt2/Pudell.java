package ru.mirea.task5.opt2;

public class Pudell extends Dog{
    int beautiful;

    public Pudell(String name, int age, int beautiful) {
        super(name, age);
        this.beautiful = beautiful;
    }

    public int getBeautiful() {
        return beautiful;
    }

    public void setBeautiful(int beautiful) {
        this.beautiful = beautiful;
    }
    public void bro(){
        System.out.println("Pudell name is " + name + " age is " + age + " beautiful is " + beautiful);
    }
}