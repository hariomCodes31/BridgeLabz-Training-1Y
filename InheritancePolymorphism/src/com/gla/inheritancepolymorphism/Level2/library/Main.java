package com.gla.inheritancepolymorphism.Level2.library;

public class Main {

    public static void main(String[] args) {

        Book book = new Author(
                "Java Programming",
                2022,
                "James Gosling",
                "Creator of Java programming language"
        );

        book.displayInfo();
    }
}