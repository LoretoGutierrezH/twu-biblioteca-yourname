package com.twu.biblioteca;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
    //Creating 5 books and adding them to availableBooks set
    static Book starmaker = new Book(1, "Starmaker", "Olaf Stapledon", 1937, true);
    static Book dune = new Book(2, "Dune", "Frank Herbert", 1965, true);
    static Book girlWithDragonTattoo = new Book(3, "The Girl with The Dragon Tattoo", "Stieg Larsson", 2005, true);
    static Book lordOfTheRings = new Book(4, "The Lord of The Rings", "J. R. R. Tolkien", 1954, true);
    static Book unavailableBook = new Book(10, "Unavailable book", "Some author", 1990, false);
    protected static Set<Book> books = Stream.of(starmaker, dune, girlWithDragonTattoo, lordOfTheRings, unavailableBook)
            .collect(Collectors.toCollection(HashSet::new));


    public static Set getBooks() {
        Set<Book> currentlyAvailable = new HashSet<Book>();
        for (Book book:books) {
            if (book.available) {
                currentlyAvailable.add(book);
            }
        }
       return currentlyAvailable;
    }

    public static String checkoutBook(int id) {
        //option b
        for (Book book:books) {
            if (book.id == id && !book.available) {
                return Notification.unsuccessfulCheckout;
            } else if (book.id == id && book.available) {
                book.available = false;
                return Notification.successfulCheckout;
            }


        }
        return ""; //ask if this is necessary
    }

    public static String returnBook(int id) {
        //valid return
        for (Book book:Library.books) {
            if (book.id == id && !book.available) {
                book.available = true;
                return Notification.successfulReturn;
            } else if (book.id == id && book.available) {
                return Notification.unsuccessfulReturn;
            }
        }

        return "";
    }

    public String toString() {
        return "Library: (" + books + " )";
    }
}
