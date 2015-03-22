package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Books> bookList = new ArrayList<Books>();
    List<Option> options = new ArrayList<Option>();


    {
        bookList.add(new Books("RAMAYANA", "MAHARISHI VALMIKI" , 1999));
        bookList.add(new Books("THE ADVENTURE OF SHERLOCK HOLMES", "SIR ARTHUR CONAN DOYLE", 2000));
        bookList.add(new Books("WINGS OF FIRE", "A.P.J. ABDUL KALAM", 2001));
        bookList.add(new Books("FIVE POINT SOMEONE", "CHETAN BHAGAT", 2002));
        options.add(new Option("List Books"));
        options.add(new Option("Quit"));
    }
    public String getWelcomeMessage() {
        return "Welcome to Biblioteca";
    }

    public List<Books> giveBookList() {
        return bookList;
    }

    public String displayAllBooks() {
        String allBooks = "";
        for(Books book:bookList){
            allBooks += book.toString()+"\n";
        }
        return allBooks;
    }

    public List<Option> getAllOptions() {
        return options;
    }

    public String displayOptions() {
        String allOptions = "";
        int i = 1;
        for(Option option : options){
            allOptions += i+". "+option.toString()+"\n";
            i++;
        }
        return allOptions;
    }

    public void optionHandler(int option) {
        switch (option){
            case 1:
                System.out.println("List of Books : \n"+displayAllBooks());
                return;
            case 2:
                System.exit(0);
                return;
            default:
                System.out.println("Enter a valid option");
                return;
        }
    }
}