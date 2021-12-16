package ru.mirea.task24;


import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static String myIp;
    private static boolean bool;

    // Проверка на валидность
    private static final String IP =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        myIp=scanner.next();
        bool= validate(myIp);
        if(bool==true) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
    public static boolean validate( String ip){
        Pattern pattern = Pattern.compile(IP);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}