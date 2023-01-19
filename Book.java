package ru.tinkoff.fintech;

public final class Book {
    private String name;
    private String author;
    private int serialNum;
    private int pageCount;
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getSerialNum() {
        return serialNum;
    }
    public int getPageCount() {
        return pageCount;
    }
    public Book(final String name, final String author) {
        this.name = name;
        this.author = author;
    }
    public Book(final String name, final String author, final int serialNum, final int pageCount) {
        this.name = name;
        this.author = author;
        this.serialNum = serialNum;
        this.pageCount = pageCount;
    }
    public Book(final String name, final String author, final int serialNum) {
        this.name = name;
        this.author = author;
        this.serialNum = serialNum;
    }
    @Override
    public String toString() {
        return name + " " + author + " " + serialNum + " " + pageCount;
    }
}
