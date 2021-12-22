package com.teachmeskills.homework_5.homework2_1;

public class ATM {
    int[] banknote20;
    int[] banknote50;
    int[] banknote100;

    public ATM(int banknote20Count, int banknote50Count, int banknote100Count) {
        this.banknote20 = new int[banknote20Count];
        this.banknote50 = new int[banknote50Count];
        this.banknote100 = new int[banknote100Count];
    }

    public void withdrawCash(int amountToWithdraw){
        int totalAmount = 20*banknote20.length + 50*banknote50.length + banknote100.length*100;

        if(amountToWithdraw > totalAmount){
            System.out.println("Недостаточно денег в банкомате");
        } else {
            getCash(amountToWithdraw);
        }
    }

    private void getCash(int amountToWithdraw){
        // расчитываем остаток после выдачи по 100
        int balanceAfter100 = amountToWithdraw % 100;
        // расчитываем сколько 100 выдавать
        int count100ToWithdraw = amountToWithdraw / 100;

        // выдаем 100
        if (count100ToWithdraw > 0) {
            banknote100 = new int[banknote100.length - count100ToWithdraw];
        }

        // рассчитываем остаток после выдачи по 50
        int balanceAfter50 = balanceAfter100 % 50;
        // рассчитываем сколько 50 выдавать
        int count50ToWithdraw = balanceAfter100 / 50;

        if (count50ToWithdraw > 0) {
            banknote50 = new int[banknote50.length - count50ToWithdraw];
        }

        // рассчитываем остаток после выдачи по 20
        int balanceAfter20 = balanceAfter50 % 20;
        // рассчитываем сколько 20 выдавать
        int count20ToWithdraw = balanceAfter50 / 20;

        if (count20ToWithdraw > 0) {
            banknote20 = new int[banknote20.length - count20ToWithdraw];
        }

        System.out.println("Запрошена сумма = " + amountToWithdraw);
        System.out.println("Выдано купюр по 100 = " + count100ToWithdraw + " , купюр по 50 = " + count50ToWithdraw + " , купюр по 20 = " + count20ToWithdraw);
        System.out.println("Остаток = " + balanceAfter20);
    }

    public void getATMInfo(){
        int currentBalance = 20*banknote20.length + 50*banknote50.length + banknote100.length*100;
        System.out.println("Текущий баланс банкомата = " + currentBalance);
        System.out.println("Купюр 20 = " + banknote20.length);
        System.out.println("Купюр 50 = " + banknote50.length);
        System.out.println("Купюр 100 = " + banknote100.length);
    }
}
