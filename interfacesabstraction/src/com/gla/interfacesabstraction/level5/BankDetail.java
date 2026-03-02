package com.gla.interfacesabstraction.level5;

public class BankDetail implements SensitiveData {

    private String accountNumber;

    public BankDetail(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
    }
}