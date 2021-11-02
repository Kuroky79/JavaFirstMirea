package ru.mirea.task15.opt1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "src/ru/mirea/task15/test.txt";
        //запись
        System.out.println("Write here: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        writeFile(path, str,false);
        //вывод
        System.out.print("It was: ");
        readFile(path);
        //замена
        System.out.println("Write something ");
        str = scanner.nextLine();
        writeFile(path, str, false);
        // добавление текста
        System.out.println("Write more");
        str = scanner.nextLine();
        writeFile(path, str, true);
    }

    static void readFile(String name){
        try(FileReader reader = new FileReader(name))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    static void writeFile(String name, String str, boolean append){
        try(FileWriter writer = new FileWriter(name, append))
        {
            writer.write(str);
            writer.append("\n");
            writer.flush();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}