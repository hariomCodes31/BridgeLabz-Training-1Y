package com.gla.inheritancepolymorphism.Level3.course;

public class Main {

    public static void main(String[] args) {

        Course course = new PaidOnlineCourse(
                "Java OOP",
                40,
                "Udemy",
                true,
                5000,
                20
        );

        course.displayDetails();
    }
}