package ru.mirea.task20;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calendar calendar = new Calendar(2021, 12, 9, 10, 20);
        System.out.println(calendar.toString());
    }
}
class Calendar {
    private Date date;

    private int year;

    private int mount;

    private int day;

    private int hour;

    private int minute;

    public Calendar(int year, int mount, int day, int hour, int minute) {
        this.year = year;

        this.mount = mount;

        this.day = day;

        this.hour = hour;

        this.minute = minute;
    }

    public String toString(){
        long newdate = (year - 1970) * 31104000000L + mount * 2592000000L + day * 86400000L + hour * 3600000L + minute * 60000L;
        date = new Date(newdate);
        return "So date will be: " + date.toString();
    }

}