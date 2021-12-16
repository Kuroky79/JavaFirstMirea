package ru.mirea.task28;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Tesla ");
        car.launch();
        Car moto = new Car("HarleyDavidson"){
            void launch(){
                Motor motor = new Motor();
                motor.turn_engine();
                System.out.println("Motorcycle " + getName() + " is turned on!" );
            }
        };
        moto.launch();
    }
}

class Car{
    private String title;

    Car(String title){
        setTitle(title);
    }
    public void setTitle(String title) {
        this.title = title;
    }
    static class Motor{
        void turn_engine(){
            System.out.println("Engine is turned off.");
        }
    }
    public String getName() {
        return title;
    }
    void launch(){
        Motor motor = new Motor();
        motor.turn_engine();
        System.out.println("Car " + getName() + "is turned on!" );
    }
}