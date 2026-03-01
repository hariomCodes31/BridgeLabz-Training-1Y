package com.gla.inheritancepolymorphism.Level1.employee;

public class Main {public static void main(String[] args) {

    Employee[] employees = {
            new Manager("Hari Om Singh", 101, 80000, 5),
            new Developer("Shikhar", 102, 60000, "Java"),
            new Intern("Prithvi", 103, 20000, 6)
    };

    for (Employee emp : employees) {
        emp.displayDetails();
    }
}
}
