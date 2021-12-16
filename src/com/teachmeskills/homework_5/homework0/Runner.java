package com.teachmeskills.homework_5.homework0;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");
        CreditCard creditCard1 = new CreditCard(1544, 100);
        CreditCard creditCard2 = new CreditCard(123, 150);
        CreditCard creditCard3 = new CreditCard(1458, 240);
        creditCard1.depositMoney();
        creditCard2.depositMoney();
        creditCard3.withdrawMoney();
        creditCard1.cardInformation();
        creditCard2.cardInformation();
        creditCard3.cardInformation();
        System.out.println("End");
    }
}
