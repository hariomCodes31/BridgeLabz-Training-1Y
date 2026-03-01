package com.gla.inheritancepolymorphism.Level1.employee;

public class Intern extends Employee {

    private int durationMonths;

    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration (months): " + durationMonths);
        System.out.println("Role: Intern");
        System.out.println("----------------------");
    }
}