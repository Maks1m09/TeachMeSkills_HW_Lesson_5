package com.teachmeskills.homework_5.homework2;

import java.util.Arrays;

public class CashMachine {
    public boolean isAlive;
    public BoxWithMoney [] arrayBox;

    public CashMachine(boolean isAlive, BoxWithMoney[] arrayBox) {
        this.isAlive = isAlive;
        this.arrayBox = arrayBox;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                "isAlive=" + isAlive +
                ", arrayBox=" + Arrays.toString(arrayBox) +
                '}';
    }
    //    public int withdrawMoney (){
//        if (BoxWithMoney [] arrayBox)
//    }
}
