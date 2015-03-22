package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println(biblioteca.getWelcomeMessage());
        System.out.println("Options Available are : \n");
        System.out.println(biblioteca.displayOptions());
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Choice:");
            int option = scanner.nextInt();
            biblioteca.optionHandler(option);
        }
    }
}
