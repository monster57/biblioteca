package com.twu.biblioteca;

public class Books {
    private String bookName;
    private String author;
    private int year;

    public Books(String bookName, String author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }
    @Override
    public String toString(){
        return bookName+" - "+author+" - "+year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (!author.equals(books.author)) return false;
        if (!bookName.equals(books.bookName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookName.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
