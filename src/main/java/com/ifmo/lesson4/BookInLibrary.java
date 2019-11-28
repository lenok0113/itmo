package com.ifmo.lesson4;

public class BookInLibrary {
    Book book;
    int quantity;

    public BookInLibrary(Book book, int q) {
        this.book = book;
        this.quantity = q;
    }

    public boolean equals(BookInLibrary a, BookInLibrary b) {
        if (a.book.author.equals(b.book.author) && a.book.title.equals(b.book.title))
            return true;
        return false;
    }
}
