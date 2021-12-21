package ru.mirea.task2.opt4;

public class Dog {
    private String name;
    private int age;


    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;

    }
    public void toHumanAge() {
        int humanAge = age * 7;
        System.out.println("In human age is: " + humanAge);
    }

    @Override
    public String toString() {
        return "Dog name is " + name + " age is " + age;
    }
}