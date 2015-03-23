package com.twu.biblioteca;

public class Menu {
    private final Biblioteca biblioteca;

    public Menu(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public String displayAllBooks() {
        String allBooks = "";
        for (Books book : biblioteca.getBookList()) {
            allBooks += book.toString() + "\n";
        }
        return allBooks;
    }

    public void optionHandler(int option) {
        switch (option) {
            case 1:
                System.out.println("List of Books : \n" + displayAllBooks());
                return;
            case 2:
                System.exit(0);
                return;
            default:
                System.out.println("Enter a valid option");
        }
    }
}