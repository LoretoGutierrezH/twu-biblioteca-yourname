package com.twu.biblioteca;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {
    public Set<Book> availableBooks = new HashSet<Book>();
    public Set<Book> borrowedBooks = new HashSet<Book>();

    public Library(Set availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Set getLibrary() {
       return availableBooks;
    }

    public String checkoutBook(int id) {
        borrowedBooks = availableBooks.stream().map(book -> book.id == id ? book : null).collect(Collectors.toSet());
        return "Books borrowed: " + borrowedBooks;
    }

    public void returnBook() {

    }

    public String toString() {
        return "Library: (" + availableBooks + " )";
    }
}
