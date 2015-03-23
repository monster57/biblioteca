package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MenuTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();
    private Menu menu;
    private MenuItem quit;
    private MenuItem listBooks;

    @Before
    public void setUp() throws Exception {
        menu = new Menu();
        quit = new MenuItem("Quit", new QuitCommand());
        PrintStream out = System.out;
        Library lib = new Library();
        listBooks = new MenuItem("List Books", new ListBooksCommand(out, lib));

    }

    @Test
    public void testMenuAddsMenuItemsToTheMenu() throws QuitBibliotecaException, InvalidOptionException {
        menu.addItem(quit);
        thrown.expect(QuitBibliotecaException.class);
        thrown.expectMessage("Thank You! Visit Again");
        menu.handleOption(1);
    }

    @Test
    public void testMenuShouldGiveListOfAllMenuItems() {
        menu.addItem(listBooks);
        menu.addItem(quit);
        String expected = "1. List Books" + System.lineSeparator()
                + "2. Quit" + System.lineSeparator();
        assertEquals(expected, menu.toString());
    }

    @Test
    public void testMenuShouldTellOptionIsInvalid() throws QuitBibliotecaException, InvalidOptionException {
        thrown.expect(InvalidOptionException.class);
        thrown.expectMessage("Invalid Option");
        menu.handleOption(3);
    }
}