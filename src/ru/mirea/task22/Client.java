package ru.mirea.task22;

public class Client {
    private AbstractFactory abstractFactory;
    private Chair chair;
    public Client(AbstractFactory abstractFactory){
        this.abstractFactory = abstractFactory;
    }
    public void Sit(String chair){
        this.chair = abstractFactory.getName(chair);
    }
    public String getChair(){
        return this.chair.getName();
    }

    public static void main(String[] args){
        Client client = new Client(new AbstractFactory());
        client.Sit("Magic");
        System.out.println("Current chair is: "+client.getChair()); // Вывод MagicChair
    }
}