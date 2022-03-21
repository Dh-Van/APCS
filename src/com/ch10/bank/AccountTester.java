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

        System.out.printf("\n");

        SavingsAccount sa = new SavingsAccount(1234, 300.0, .04);
        System.out.println("Savings account " + sa.currentBalance());
        sa.deposit(50.0);
        sa.withdraw(600.0);
        sa.withdraw(100.0);
        System.out.println("250.0 " +sa.currentBalance());

        System.out.printf("\n");

        SpecialCheckingAccount sca1 = new SpecialCheckingAccount(1235, 350.0, 2.5, 0.05, 500.0);
        System.out.println("Special Account " + sca1.currentBalance());
        sca1.clearCheck(200.0);
        sca1.deposit(100);
        System.out.println("247.5 " + sca1.currentBalance());

        System.out.printf("\n");

        SpecialCheckingAccount sca2 = new SpecialCheckingAccount(1236, 850.0, 2.5, .05, 400.0);
        System.out.println("Special Account " + sca2.currentBalance());
        sca2.clearCheck(200.0);
        sca2.deposit(245.0);
        System.out.println("895.0 " + sca2.currentBalance());

        System.out.printf("\n");

        Account [] accounts = {ca, sa, sca1, sca2};
        for(Account a: accounts){
            System.out.println("Account " + a.idNumber());
            System.out.println("Balance " + a.currentBalance());
            System.out.println("Interest " + a.monthlyInterest());
            System.out.printf("\n");
        }
        System.out.println("Interest: 1.0, .833, 1.0, 3.73");

    }
}
/* Output:
Checking account 567.5
365.5 365.5

Savings account 300.0
250.0 250.0

Special Account 350.0
247.5 247.5

Special Account 850.0
895.0 895.0

Account 1233
Balance 365.5
Interest 1.0

Account 1234
Balance 250.0
Interest 0.8333333333333334

Account 1235
Balance 247.5
Interest 1.0

Account 1236
Balance 895.0
Interest 3.7291666666666665

Interest: 1.0, .833, 1.0, 3.73
 */
