package com.gla.inheritancepolymorphism.Level4.bank;

public class Main {

    public static void main(String[] args) {

        BankAccount[] accounts = {
                new SavingsAccount("SA101", 50000, 4.5),
                new CheckingAccount("CA102", 30000, 20000),
                new FixedDepositAccount("FD103", 100000, 5)
        };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            acc.displayAccountType();
            System.out.println("------------------------");
        }
    }
}