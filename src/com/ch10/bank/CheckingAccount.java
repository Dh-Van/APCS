package com.ch10.bank;

public class CheckingAccount extends Account{

    private double checkCharge;

    public CheckingAccount(int idNumber, double startBal, double cc) {
        super(idNumber, startBal);
        checkCharge = cc;
    }

    public void clearCheck(double amount)
    {
        decreaseBalance(amount + checkCharge);
    }

    @Override
    public double monthlyInterest() {
        return 1.0;
    }
}
