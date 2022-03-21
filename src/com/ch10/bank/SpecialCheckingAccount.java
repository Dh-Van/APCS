package com.ch10.bank;

public class SpecialCheckingAccount extends CheckingAccount{

    private double minBal;
    private double intrestRate;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double intrestRate, double minBal) {
        super(idNumber, startBal, cc);
        this.minBal = minBal;
        this.intrestRate = intrestRate;
    }

    @Override
    public void clearCheck(double amount)
    {
        if(super.currentBalance() > minBal){
            super.decreaseBalance(amount);
        } else {
            super.clearCheck(amount);
        }
    }

    @Override
    public double monthlyInterest() {
        if(super.currentBalance() > minBal){
            return (super.currentBalance() * intrestRate) / 12;
        } else {
            return super.monthlyInterest();
        }
    }
}

