package ru.mirea.task5.opt3;

public class Test {
    public static void main(String[] args) {
        Sofa set = new Sofa(350,"Skin",30);
        Table t1 = new Table(250,"Trees",35);
        set.action();
        t1.action();
        FurnitureShop shop = new FurnitureShop(set,t1,40,50);
        shop.sale(t1,6);
        System.out.println(shop.getNum_p2());
        shop.sale(set,60);
        System.out.println(shop.getNum_p1());
        shop.setNum_p1(20);
        System.out.println(shop.getNum_p1());

    }
}