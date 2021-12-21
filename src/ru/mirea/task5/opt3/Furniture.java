package ru.mirea.task5.opt3;

public abstract class Furniture {

    private String material;
    private int weight;
    private int price;

    public Furniture(String material, int weight, int price) {
        this.material = material;
        this.weight = weight;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}