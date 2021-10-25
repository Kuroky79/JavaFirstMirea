package ru.mirea.task12.opt1;

public class Student implements Comparable<Student> {
    private final String lastName;
    private final int gpaScore;
    private final int studentId;
    private final String firstName;


    public Student(int studentId, String firstName, String lastName, int gpaScore) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpaScore = gpaScore;
    }
    public double getGpaScore() {
        return gpaScore;
    }
    @Override
    public String toString() {
        return "{" + this.studentId + " ," + this.gpaScore + " ," + this.firstName + " "+ this.lastName  + "}";
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.studentId, student.studentId);
    }
}