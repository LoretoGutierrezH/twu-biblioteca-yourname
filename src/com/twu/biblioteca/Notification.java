package com.twu.biblioteca;

public class Notification {
    static String welcome() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    static String invalidOption() {
        return "Please, select a valid option! ";
    }

    static String successfulCheckout() {
        return "Thank you! Enjoy the book.";
    }

    static String unsuccessfulCheckout() {
        return "Sorry, that book is not available! ";
    }

    static String successfulReturn() {
        return "Thank you for returning the book!";
    }

    static String unsuccessfulReturn() {
        return "That is not a valid book to return. ";
    }


}
