package com.ch10.book;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<>();
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W Denslow");

        myLibrary.add(book1);
        myLibrary.add(book2);

        for(Book b : myLibrary){
            b.printBookInfo();
            System.out.println();
        }

        BookListing bl1 = new BookListing(book1, 10.99);
        BookListing bl2 = new BookListing(book2, 12.99);

        bl1.printDescription();
        bl2.printDescription();
    }
}
