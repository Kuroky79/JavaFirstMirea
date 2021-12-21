package ru.mirea.task2.opt5;

public class TestDog {
    Dog [] arr = new Dog[10];
    int iter = 0;

    public int getIter() {
        return iter;
    }

    public Dog[] getArr() {
        return arr;
    }

    public void addDog(){
        arr[iter] = new Dog("Joy " + iter, iter);
        iter++;
        arr[iter] = new Dog("Genry " + iter, iter+9);
        iter++;
    }
    public static void main(String[] args) {
        TestDog test1 = new TestDog();
        test1.addDog();
        test1.addDog();
        for (int i = 0; i < test1.getIter(); i++){
            System.out.println(test1.getArr()[i].toString());
        }

    }
}