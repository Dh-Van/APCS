package com.ch10.book;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void printBookInfo(){
        System.out.print(title + ", written by " + author);
    }
}
