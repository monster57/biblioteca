package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BibliotecaTest {

    @Test
    public void testGetWelcomeMessageGivesAWelcomeMessage() {
        String expected = "Welcome to Biblioteca";
        Biblioteca biblioteca = new Biblioteca();
        assertTrue(expected.equals(biblioteca.getWelcomeMessage()));
    }

    @Test
    public void testCreateBookListShowsNamesOfAllBooks(){
        Biblioteca biblioteca = new Biblioteca();
        List<Books> expected = new ArrayList<Books>();
        expected.add(new Books("RAMAYANA", "MAHARISHI VALMIKI", 1999));
        expected.add(new Books("THE ADVENTURE OF SHERLOCK HOLMES", "SIR ARTHUR CONAN DOYLE", 2000));
        expected.add(new Books("WINGS OF FIRE", "A.P.J. ABDUL KALAM", 2001));
        expected.add(new Books("FIVE POINT SOMEONE", "CHETAN BHAGAT", 2002));
        assertTrue(expected.containsAll(biblioteca.giveBookList()));
    }

    @Test
    public void testDisplayAllBooksShowsAllBooks(){
        Biblioteca biblioteca = new Biblioteca();
        String books = "RAMAYANA - MAHARISHI VALMIKI - 1999\n"+
                "THE ADVENTURE OF SHERLOCK HOLMES - SIR ARTHUR CONAN DOYLE - 2000\n"+
                "WINGS OF FIRE - A.P.J. ABDUL KALAM - 2001\n"+
                "FIVE POINT SOMEONE - CHETAN BHAGAT - 2002\n";
        assertTrue(books.equals(biblioteca.displayAllBooks()));
    }
    @Test
    public void testGiveOptionShouldGiveAllValidOption(){
       Biblioteca biblioteca  = new Biblioteca();
       List<Option> options = new ArrayList<Option>();
        options.add(new Option("List Books"));
        options.add(new Option("Quit"));
        assertTrue(options.equals(biblioteca.getAllOptions()));
    }

    @Test
    public void testDisplayOptionShowAllOption(){
        Biblioteca biblioteca  = new Biblioteca();
        String option = "1. List Books\n2. Quit\n";
        assertTrue(option.equals(biblioteca.displayOptions()));
    }
}
