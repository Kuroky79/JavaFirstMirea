package ru.mirea.task13.opt3;

public class TestArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("H");
        list.add("E");
        list.add("L");
        list.add("L");
        list.add("O");
        list.add("World!");

        list.remove(2);

        list.set(2, "L");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i) + " ");
        }
    }
}