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
        idNumber[0] = new Student(3, "Fraer", "Ordinary", 9);
        idNumber[1] = new Student(8, "Botan", "Smart", 11);
        idNumber[2] = new Student(5, "Matty", "Pit", 19);
        idNumber[3] = new Student(15, "Crok", "Green", 1);
        idNumber[4] = new Student(6, "Kolt", "Ferguson", 13);
        System.out.println(Arrays.toString(idNumber));
        insertionSort(idNumber);
        System.out.println(Arrays.toString(idNumber));
    }
}