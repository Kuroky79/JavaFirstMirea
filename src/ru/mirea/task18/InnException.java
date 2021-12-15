package ru.mirea.task18;

import java.math.BigInteger;

public class InnException extends Exception {

    private BigInteger innNum;

    public InnException(BigInteger inn){
        super("Ваш ИНН "+ inn + " не верен. Попробуйте еще раз.");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}