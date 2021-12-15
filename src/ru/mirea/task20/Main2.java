package ru.mirea.task20;

import java.util.Date;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args){
        Student student1 = new Student("Nikita", "Wed Dec 19 20:30:30 MSK 2021");
        System.out.println(student1);
        student1.setNewDate();
        System.out.println(student1);
    }
}

class Student{
    private String name;
    private String startDate;
    private String finishDate = "-1";

    Student(String name, String startDate){
        this.name = name;
        this.startDate = startDate;
    }

    public void setNewDate() {
        Date date = new Date();
        this.finishDate = date.toString();
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getFinishDate() {
        if (!Objects.equals(finishDate, "-1")){
            return finishDate;
        }
        else {
            return "Task has not passed.";
        }
    }

    public String toString(){
        String text = "Student: " + getName() + "\nReceive task on: " + getStartDate();
        text += "\nPass task in: " + getFinishDate();
        return text;
    }
}