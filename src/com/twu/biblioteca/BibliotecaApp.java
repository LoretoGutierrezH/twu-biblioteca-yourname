package com.twu.biblioteca;

import java.util.Scanner;


public class BibliotecaApp {
    public static void main(String[] args) {

        //Initializing application
        Scanner sc = new Scanner(System.in);
        System.out.println(Notification.welcome);
        System.out.println("Menu options - 1- Books (show list of books), 2- Borrow (borrow a book), 3- Return (return a book)");

        //Waiting for user input and reacting accordingly
        while (true) {
            String userInput = sc.nextLine();
            switch(userInput) {
                case "1":
                case "Books":
                case "books":
                    System.out.println(Library.getBooks());
                    break;

                case "2":
                case "Borrow":
                case "borrow":
                    System.out.print(Notification.borrowOption);
                    userInput = sc.nextLine();
                    System.out.println(Library.checkoutBook(Integer.parseInt(userInput)));
                    break;

                case "3":
                case "Return":
                case "return":
                    System.out.println(Notification.returnOption);
                    userInput = sc.nextLine();
                    System.out.println(Library.returnBook(Integer.parseInt(userInput)));
                    break;

                case "Quit":
                case "quit":
                    System.out.println(Notification.onQuit);
                    break;


                default: {
                    System.out.println(Notification.invalidOption);
                    break;
                }
            }

           if (userInput.equals("quit") || userInput.equals("Quit")) {
                break;
           }

        }
    }
}
