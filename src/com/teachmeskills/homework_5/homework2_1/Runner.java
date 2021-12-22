package com.teachmeskills.homework_5.homework2_1;

public class Runner {
    public static void main(String[] args) {
        ATM atm = new ATM(5, 7, 8);

//        System.out.println("_______________");
//        atm.getATMInfo();
//
//        System.out.println("_______________");
//        atm.withdrawCash(123);
//
//        System.out.println("_______________");
//        atm.getATMInfo();
//
//        System.out.println("_______________");
//        atm.withdrawCash(978);
        ATM2 atm2 = new ATM2(3, 2, 5);
        atm2.getATMInfo();
        atm2.withdrawCash(643);
        atm2.getATMInfo();
    }
}
