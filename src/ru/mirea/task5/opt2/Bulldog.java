package ru.mirea.task5.opt2;

class Bulldog extends Dog{
    int power;
    public Bulldog(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void info(){
        System.out.println("Bulldog name is " + name + " age is " + age + " power is " + power);
    }
}