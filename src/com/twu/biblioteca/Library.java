package com.twu.biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Library {
    public Set<Book> availableBooks = new HashSet<Book>();

    public Library(Set availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Set getLibrary() {
       return availableBooks;
    }

    public void checkoutBook() {

    }

    public void returnBook() {

    }

    public String toString() {
        return "Library: (" + availableBooks + " )";
    }
}
