package com.twu.biblioteca;

public class Book {
    protected int id;
    protected String title;
    protected String author;
    protected int publicationYear;

    public Book(int id, String title, String author, int publicationYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Book ID: " + this.id + " - Title: " + this.title + " Author: " + this.author + " Publication year: " + this.publicationYear + "\n";
    }

}
