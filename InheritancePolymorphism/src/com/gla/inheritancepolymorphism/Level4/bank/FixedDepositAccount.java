package com.gla.inheritancepolymorphism.Level4.bank;

public class FixedDepositAccount extends BankAccount {

    private int tenureYears;

    public FixedDepositAccount(String accountNumber, double balance, int tenureYears) {
        super(accountNumber, balance);
        this.tenureYears = tenureYears;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenureYears + " years");
    }
}