package com.ch10.bank;

public class AccountTester {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Create a checking account
        CheckingAccount ca = new CheckingAccount(1233, 567.50, 2.0);
        System.out.println("Checking account " + ca.currentBalance());
        ca.clearCheck(250.0);
        ca.deposit(50.0);
        System.out.println("365.5 " + ca.currentBalance());

        SavingsAccount sa = new SavingsAccount(1234, 300.0, .04);
        System.out.println("Savings account " + sa.currentBalance());
        sa.deposit(50.0);
        sa.withdraw(600.0);
        sa.withdraw(100.0);
        System.out.println("250.0 " +sa.currentBalance());

        SpecialCheckingAccount sca1 = new SpecialCheckingAccount(1235, 350.0, 2.5, 0.05, 500.0);
        System.out.println("Special Account " + sca1.currentBalance());
        sca1.clearCheck(200.0);
        sca1.deposit(100);
        System.out.println("247.5 " + sca1.currentBalance());

        SpecialCheckingAccount sca2 = new SpecialCheckingAccount(1236, 850.0, 2.5, .05, 400.0);
        System.out.println("Special Account " + sca2.currentBalance());
        sca2.clearCheck(200.0);
        sca2.deposit(245.0);
        System.out.println("895.0 " + sca2.currentBalance());

        Account [] accounts = {ca, sa, sca1, sca2};
        for(Account a: accounts){
            System.out.println("Account " + a.idNumber());
            System.out.println("Balance " + a.currentBalance());
            System.out.println("Interest " + a.monthlyInterest());
        }
        System.out.println("Interest: 1.0, .833, 1.0, 3.73");

    }
}
