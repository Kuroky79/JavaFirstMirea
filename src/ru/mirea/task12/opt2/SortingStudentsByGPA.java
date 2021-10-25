package ru.mirea.task12.opt2;

import ru.mirea.task12.opt1.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student lhs, Student rhs) {
        return Double.compare(rhs.getGpaScore(), lhs.getGpaScore());
    }
}