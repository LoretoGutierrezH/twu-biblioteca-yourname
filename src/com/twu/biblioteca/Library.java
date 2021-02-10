package com.twu.biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Library {
    public Set<Book> available_books = new HashSet<Book>();

    public Library(Set available_books) {
        this.available_books = available_books;
    }

    public Set getLibrary() {
       return available_books;
    }

    public int size() {
        return available_books.size();
    }

    public String toString() {
        return "Library: (" + available_books + " )";
    }
}
