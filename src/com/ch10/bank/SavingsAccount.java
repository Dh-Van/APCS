package com.ch10.bank;

public class SavingsAccount extends Account{

    private double intrestRate;

    public SavingsAccount(int id, double startBal, double intrestRate) {
        super(id, startBal);
        this.intrestRate = intrestRate;
    }

    public void withdraw(double amount){
        if(amount <= super.currentBalance())
            super.decreaseBalance(amount);
    }

    @Override
    public double monthlyInterest() {
        return (super.currentBalance() * intrestRate) / 12;
    }
}
