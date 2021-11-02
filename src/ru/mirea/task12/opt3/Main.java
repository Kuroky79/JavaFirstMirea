package ru.mirea.task12.opt3;

import ru.mirea.task12.opt1.Student;

import java.util.Arrays;

public class Main {

    private static final int ARRAY_SIZE = 5;

    public static void mergeSort(Student[] first, Student[] second, Student[] merged) {
        Arrays.sort(first);
        Arrays.sort(second);
        int left = 0, right = 0;
        int i = 0;
        for (; i < merged.length && left < first.length && right < second.length; ++i) {
            merged[i] = first[left].compareTo(second[right]) > 0 ? second[right++] : first[left++];
        }
        if (left == first.length) {
            for (; right < second.length; ++right) {
                merged[i++] = second[right];
            }
        }
        if (right == second.length) {
            for (; left < first.length; ++left) {
                merged[i++] = first[left];
            }
        }
    }
    public static void main(String[] args) {
        Student[] firstArr = new Student[ARRAY_SIZE];
        Student[] secondArr = new Student[ARRAY_SIZE];
        Student[] mergedArr = new Student[ARRAY_SIZE * 2];
        firstArr[0] = new Student(1, "Brain", "Rain", 14);
        firstArr[1] = new Student(3, "Jho", "Tor", 14);
        firstArr[2] = new Student(5, "Frick", "Smel", 7);
        firstArr[3] = new Student(6, "Cot", "Murray", 8);
        firstArr[4] = new Student(3, "Kelt", "Pit", 14);
        secondArr[0] = new Student(1, "Fraer", "Ordinary", 7);
        secondArr[1] = new Student(6, "Botan", "Smart", 4);
        secondArr[2] = new Student(4, "Matty", "APerkot", 7);
        secondArr[3] = new Student(14, "Crok", "Green", 23);
        secondArr[4] = new Student(11, "Kolt", "Ferguson", 15);
        mergeSort(firstArr, secondArr, mergedArr);
        System.out.println(Arrays.toString(mergedArr));
    }
}