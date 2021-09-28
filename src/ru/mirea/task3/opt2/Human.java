package ru.mirea.task3.opt2;

public class Human{
    private int head;
    private int leg;
    private int hand;

    public Human(int head, int leg, int hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public int getHead() {
        return head;
    }

    public int getLeg() {
        return leg;
    }

    public int getHand() {
        return hand;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public void volk(){
        System.out.println("head " + head +  "leg " + leg + "hand " + hand);
    }

}