package com.gla.inheritancepolymorphism.Level4.school;

public class Main {

    public static void main(String[] args) {

        Person[] people = {
                new Teacher("Mr. Sharma", 40, "Mathematics"),
                new Student("Aman", 18, "12th Grade"),
                new Staff("Rakesh", 35, "Administration")
        };

        for (Person p : people) {
            p.displayDetails();
            p.displayRole();
            System.out.println("------------------------");
        }
    }
}