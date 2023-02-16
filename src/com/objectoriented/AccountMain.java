package com.objectoriented;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args)
    {
        String name;
        double amount, depositAmount, withdrawAmount;
        Scanner read = new Scanner(System.in);

        AccountManagement pay = new AccountManagement();
        System.out.println("Enter name of account holder: ");
        name = read.next();
        System.out.println("Enter amount: ");
        amount = read.nextDouble();
        System.out.println("The current balance is: ");
        System.out.println(pay.account(name , amount));
        System.out.println("Enter deposit amount: ");
        depositAmount = read.nextDouble();
        System.out.println("The current balance after deposit is: ");
        System.out.println(pay.deposit(depositAmount));
        System.out.println("Enter withdraw amount: ");
        withdrawAmount = read.nextDouble();
        System.out.println("The current balance after withdraw is: ");
        System.out.println(pay.withdraw(withdrawAmount));
    }


}
