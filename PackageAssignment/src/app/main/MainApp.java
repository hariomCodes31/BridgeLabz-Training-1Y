package app.main;

import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {

        Student s = new Student("Hariom", 101);
        Faculty f = new Faculty("Dr. Sharma", "Java Programming");

        s.display();
        System.out.println("----------------");
        f.display();
    }
}