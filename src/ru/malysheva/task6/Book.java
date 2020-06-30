package ru.malysheva.task6;

public class Book extends Unit {
    private String ISBN;
    private String author;
    private String title;
    // other fields...

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
}
