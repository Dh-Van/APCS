package com.ch10.bank;

public abstract class Account {
    private int idNum;
    private double balance;


    public Account(int id, double startBal)
    {
        idNum = id;
        balance = startBal;
    }

    public int idNumber()
    {
        return idNum;
    }

    public double currentBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
    public void decreaseBalance(double amount)
    {
        balance -=amount;
    }

    public abstract double monthlyInterest();
}
