package ru.mirea.task12.opt1;

import java.util.Arrays;

public class Main {

    private static final int ARRAY_SIZE = 5;

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; ++i) {
            Student key = students[i];
            int j = i - 1;
            for (; j >= 0 && students[j].compareTo(key) > 0; --j) {
                students[j + 1] = students[j];
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] idNumber = new Student[ARRAY_SIZE];
        idNumber[0] = new Student(1, "Chuck", "Berton", 10);
        idNumber[1] = new Student(5, "Jake", "Tomphson", 12);
        idNumber[2] = new Student(4, "Matt", "Perkot", 17);
        idNumber[3] = new Student(12, "Ted", "Murray", 2);
        idNumber[4] = new Student(3, "Koul", "Furton", 14);
        System.out.println(Arrays.toString(idNumber));
        insertionSort(idNumber);
        System.out.println(Arrays.toString(idNumber));
    }
}