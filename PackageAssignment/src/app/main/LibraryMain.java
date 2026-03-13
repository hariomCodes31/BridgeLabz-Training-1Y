package app.main;

import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryMain {

    public static void main(String[] args) {

        Book book = new Book("Clean Code", "Robert Martin");
        Member member = new Member("Hariom", 1001);

        Transaction transaction = new Transaction();
        transaction.issueBook(book, member);
    }
}