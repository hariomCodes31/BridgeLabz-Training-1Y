package com.gla.department.cse;

public class Course {

    private String courseName;
    private int credits;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
    }
}