package com.teachmeskills.homework_5.homework0;

import java.util.Scanner;

public class CreditCard {
 public int accountNumber;
 public int accountAmount;
 public int someAmount;

 public CreditCard(int accountNumber, int accountAmount) {
  this.accountNumber = accountNumber;
  this.accountAmount = accountAmount;
 }


 public int depositMoney() {
  Scanner scanner = new Scanner(System.in);
  System.out.println("How much do you want to put?");
  someAmount = scanner.nextInt();
  accountAmount += someAmount;
  return accountAmount;
 }

 public int withdrawMoney() {
  Scanner scanner = new Scanner(System.in);
  System.out.println("How much do you want to rent?");
  someAmount = scanner.nextInt();
  if (accountAmount > someAmount) {
   accountAmount -= someAmount;
  }
  return accountAmount;
 }

 public void cardInformation() {
  System.out.println("AccountNumber:" + accountNumber + "; " + "AccountAmount:" + accountAmount);
 }
}
