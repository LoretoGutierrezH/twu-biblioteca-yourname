package com.twu.biblioteca;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BibliotecaApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Creating 4 books and adding them to Set books_to_add
        Book starmaker = new Book(1, "Starmaker", "Olaf Stapledon", 1937);
        Book dune = new Book(2, "Dune", "Frank Herbert", 1965);
        Book girlWithDragonTattoo = new Book(3, "The Girl with The Dragon Tattoo", "Stieg Larsson", 2005);
        Book lordOfTheRings = new Book(4, "The Lord of The Rings", "J. R. R. Tolkien", 1954);
        Set<Book> booksToAdd = new HashSet<Book>();
        booksToAdd.add(starmaker);
        booksToAdd.add(dune);
        booksToAdd.add(girlWithDragonTattoo);
        booksToAdd.add(lordOfTheRings);

        //Storing books inside Bangalore's Library
        Library bangaloreLibrary = new Library(booksToAdd);

        //Initializing application
        System.out.println(Notification.welcome);
        System.out.print("Menu options - List of books (option 1) ");
        String userInput = sc.nextLine();

        //Waiting for user input and reacting accordingly
        while (!userInput.equals("option 1") && !userInput.equals("quit")) {
            System.out.print(Notification.invalidOption);
            userInput = sc.nextLine();
        }

        if (userInput.equals("option 1")) {
            System.out.println(bangaloreLibrary);
            System.out.print("Borrow a book by entering 'borrow' followed by the book id or return one by entering 'return' followed by the book id: ");
            userInput = sc.nextLine();

            if (userInput.contains("borrow")) {
                String[] inputArray = userInput.split("\\s");
                int id = Integer.parseInt(inputArray[1]);
                System.out.println(bangaloreLibrary.checkoutBook(id));
            }
        }

        if (userInput.equals("quit")) {
            System.out.println(Notification.onQuit);
        }



    }
}
