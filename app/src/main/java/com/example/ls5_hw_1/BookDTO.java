package com.example.ls5_hw_1;

public class BookDTO {


    private String BookName;

    public BookDTO(String bookName) {
        this.BookName = bookName;
    }
    public BookDTO() {

    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        this.BookName = bookName;
    }



}
