package com.teachmeskills.homework_5.homework2;

public class BoxWithMoney {
 public int twentyDollars;
    public int  fiftyDollars;
    public int  oneHundredDollars;

    public BoxWithMoney(int twentyDollars, int fiftyDollars, int oneHundredDollars) {
        this.twentyDollars = twentyDollars;
        this.fiftyDollars = fiftyDollars;
        this.oneHundredDollars = oneHundredDollars;
    }
    public int totalMoney () {
        int sum = 0;
        sum +=twentyDollars+fiftyDollars+oneHundredDollars;
        return sum;
    }

    @Override
    public String toString() {
        return "BoxWithMoney{" +
                "twentyDollars=" + twentyDollars +
                ", fiftyDollars=" + fiftyDollars +
                ", oneHundredDollars=" + oneHundredDollars +
                '}';
    }
}
