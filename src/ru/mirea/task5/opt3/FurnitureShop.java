package ru.mirea.task5.opt3;

public class FurnitureShop {
    Sofa product1;
    Table product2;
    int num_p1, num_p2;

    public FurnitureShop(Sofa product1, Table product2, int num_p1, int num_p2) {
        this.product1 = product1;
        this.product2 = product2;
        this.num_p1 = num_p1;
        this.num_p2 = num_p2;
    }

    public Sofa getProduct1() {
        return product1;
    }

    public void setProduct1(Sofa product1) {
        this.product1 = product1;
    }

    public Table getProduct2() {
        return product2;
    }

    public void setProduct2(Table product2) {
        this.product2 = product2;
    }

    public int getNum_p1() {
        return num_p1;
    }

    public void setNum_p1(int num_p1) {
        this.num_p1 = num_p1;
    }

    public int getNum_p2() {
        return num_p2;
    }

    public void setNum_p2(int num_p2) {
        this.num_p2 = num_p2;
    }
    public void sale(Furniture product, int nums){
        if (product == product1) {
            num_p1 -= nums;
            System.out.println("Sell " + nums + " the first product");
        }else {
            num_p2 -= nums;
            System.out.println("Sell " + nums + " the first product");
        }
    }
}