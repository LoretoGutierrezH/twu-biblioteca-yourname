package com.twu.biblioteca;

import java.util.Scanner;


public class BibliotecaApp {
    public static void main(String[] args) {

        //Initializing application
        Scanner sc = new Scanner(System.in);
        System.out.println(Notification.welcome);
        System.out.println("Menu options - books (show list of books), borrow (borrow a book), return (return a book)");

        //Waiting for user input and reacting accordingly
        while (true) {
            String userInput = sc.nextLine();
            switch(userInput) {
                case "books": {
                    System.out.println(Library.getBooks());
                    break;
                }

                case "borrow": {
                    System.out.print(Notification.borrowOption);
                    userInput = sc.nextLine();
                    System.out.println(Library.checkoutBook(Integer.parseInt(userInput)));
                    break;
                }

                case "return": {
                    System.out.println(Notification.returnOption);
                    userInput = sc.nextLine();
                    System.out.println(Library.returnBook(Integer.parseInt(userInput)));
                    break;
                }

                case "quit": {
                    System.out.println(Notification.onQuit);
                    break;
                }

                default: {
                    System.out.println(Notification.invalidOption);
                    break;
                }
            }

           if (userInput.equals("quit")) {
                break;
           }

        }
    }
}
