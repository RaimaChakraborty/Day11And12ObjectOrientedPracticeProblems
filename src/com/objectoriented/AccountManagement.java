package com.objectoriented;
public class AccountManagement {
    private String name;
    private double balance;

    public double account(String name, double balance)
    {
        this.name = name;
        do
        {
            if (balance > 0.0)
                this.balance = balance;
            else
            {
                System.out.println("The balance is negative please try again.");
            }
        } while (balance < 0.0);

        return balance;

    }

    public double deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
        else
            System.out.println("Deposit amount is not valid.");
        return balance;

    }

    public double withdraw(double withdrawAmount)
    {
        if (withdrawAmount <= balance)
            balance = balance - withdrawAmount;
        else
            System.out.println("Withdrawal amount exceeded account balance.");
        return balance;

    }

    public double getBalance()
    {
        return balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}

