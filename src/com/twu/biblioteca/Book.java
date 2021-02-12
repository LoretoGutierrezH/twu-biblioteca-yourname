package com.twu.biblioteca;

public class Book {
    protected int id;
    protected String title;
    protected String author;
    protected Boolean available;
    protected int publicationYear;

    public Book(int id, String title, String author, int publicationYear, Boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = available;

    }

    public String toString() {
        return "Book ID: " + this.id + " Available: " + this.available + " - Title: " + this.title + " Author: " + this.author + " Publication year: " + this.publicationYear + "\n";
    }

}
