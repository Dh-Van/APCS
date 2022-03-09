package com.ch10.book;

public class PictureBook extends Book{
    private String illustrator;

    public PictureBook(String title, String author, String illustrator){
        super(title, author);
        this.illustrator = illustrator;
    }

    @Override
    public void printBookInfo(){
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
}
