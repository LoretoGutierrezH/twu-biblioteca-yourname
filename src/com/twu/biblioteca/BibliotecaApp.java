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
        Book the_girl_with_dragon_tattoo = new Book(3, "The Girl with The Dragon Tattoo", "Stieg Larsson", 2005);
        Book the_lord_of_the_rings = new Book(4, "The Lord of The Rings", "J. R. R. Tolkien", 1954);
        Set<Book> books_to_add = new HashSet<Book>();
        books_to_add.add(starmaker);
        books_to_add.add(dune);
        books_to_add.add(the_girl_with_dragon_tattoo);
        books_to_add.add(the_lord_of_the_rings);

        //Passing Set books_to_add to bangalore_library
        Library bangalore_library = new Library(books_to_add);

        Notification cmd_line_notification = new Notification("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println(cmd_line_notification.message);
        System.out.print("Menu options - List of books (option 1) ");
        String userInput = sc.nextLine();

        if (userInput.equals("option 1")) {
            System.out.println(bangalore_library);
        } else {
            System.out.println("Something happened");
        }


    }
}
