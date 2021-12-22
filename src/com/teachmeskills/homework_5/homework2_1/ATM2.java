package com.teachmeskills.homework_5.homework2_1;

public class ATM2 {
    int[] banknote20;
    int[] banknote50;
    int[] banknote100;

    public ATM2(int banknote20Count, int banknote50Count, int banknote100Count) {
        this.banknote20 = new int[banknote20Count];
        this.banknote50 = new int[banknote50Count];
        this.banknote100 = new int[banknote100Count];
    }

    public void withdrawCash(int amountToWithdraw) {
        if (amountToWithdraw < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else {
            if (amountToWithdraw == 0) {
                System.out.println("Вы ввели 0");
            } else {
                int totalAmount = 20 * banknote20.length + 50 * banknote50.length + banknote100.length * 100;

                int count100ToWithdraw = -1;
                int count50ToWithdraw = -1;
                int count20ToWithdraw = -1;

                int balanceAfter100 = -1;
                int balanceAfter50 = -1;
                int balanceAfter20 = -1;

                if (amountToWithdraw > totalAmount) {
                    System.out.println("Недостаточно денег в банкомате");
                } else {

                    if (banknote100.length > 0) {
                        // расчитываем остаток после выдачи по 100
                        balanceAfter100 = amountToWithdraw % 100;
                        // расчитываем сколько 100 выдавать
                        count100ToWithdraw = amountToWithdraw / 100;

                        // выдаем 100
                        if (count100ToWithdraw > 0) {
                            if (count100ToWithdraw <= banknote100.length) {
                                banknote100 = new int[banknote100.length - count100ToWithdraw];
                            } else {
                                int diff100 = count100ToWithdraw - banknote100.length;
                                count100ToWithdraw = banknote100.length;
                                banknote100 = new int[0];
                                balanceAfter100 = balanceAfter100 + diff100 * 100;
                            }

                            System.out.println("here");
                        }
                    }

                    // рассчитываем остаток после выдачи по 50
                    balanceAfter50 = balanceAfter100 % 50;
                    // рассчитываем сколько 50 выдавать
                    count50ToWithdraw = balanceAfter100 / 50;

                    if (count50ToWithdraw > 0) {
                        if (count50ToWithdraw <= banknote50.length) {
                            banknote50 = new int[banknote50.length - count50ToWithdraw];
                        } else {
                            int diff50 = count50ToWithdraw - banknote50.length;
                            count50ToWithdraw = banknote50.length;
                            banknote50 = new int[0];
                            balanceAfter50 = balanceAfter50 + diff50 * 100;
                        }
                        System.out.println("here");
                    }
                    // рассчитываем остаток после выдачи по 20
                    balanceAfter20 = balanceAfter50 % 20;
                    // рассчитываем сколько 20 выдавать
                    count20ToWithdraw = balanceAfter50 / 20;

                    if (count20ToWithdraw > 0) {
                        if (count20ToWithdraw <= banknote20.length) {
                            banknote20 = new int[banknote20.length - count20ToWithdraw];
                        } else {
                            int diff20 = count20ToWithdraw - banknote20.length;
                            count20ToWithdraw = banknote20.length;
                            banknote20 = new int[0];
                            balanceAfter20 = balanceAfter20 + diff20 * 100;
                        }
                        System.out.println("here");
                    }
                    System.out.println("Запрошена сумма = " + amountToWithdraw);
                    System.out.println("Выдано купюр по 100 = " + count100ToWithdraw + " , купюр по 50 = " + count50ToWithdraw + " , купюр по 20 = " + count20ToWithdraw);
                    System.out.println("Остаток = " + balanceAfter20);
                }
            }
        }
    }

    public void getATMInfo() {
        int currentBalance = 20 * banknote20.length + 50 * banknote50.length + banknote100.length * 100;
        System.out.println("Текущий баланс банкомата = " + currentBalance);
        System.out.println("Купюр 20 = " + banknote20.length);
        System.out.println("Купюр 50 = " + banknote50.length);
        System.out.println("Купюр 100 = " + banknote100.length);
    }
}
