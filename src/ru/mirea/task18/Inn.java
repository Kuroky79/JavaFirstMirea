package ru.mirea.task18;

import java.math.BigInteger;
import java.util.Scanner;

public class Inn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Введите свой ИНН пожалуйста: ");
            try{
                BigInteger inn =  new BigInteger(sc.nextLine());
                checkInn(inn);
                break;
            }catch (InnException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("Ваш ИНН верен.");
    }

    public static boolean checkInn(BigInteger inn) throws InnException{
        int i = 0;

        BigInteger cInn = new BigInteger(inn.toByteArray());

        while (!cInn.equals(new BigInteger("0"))){
            i++;
            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray());
        }
        if(i != 10 && i != 12) throw new InnException(inn);
        return true;
    }
}