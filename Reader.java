package ru.tinkoff.fintech;
import java.util.Random;

public final class Reader {
    public Book choiceBook(final Book[] books) {
        Random rand = new Random();
        return books[rand.nextInt(books.length)];
    }
    public void readBook(final Book book) {
        System.out.println(book.toString());
    }
    public void rateBook(final Book book) {
        Random rand = new Random();
        int rate = book.getName().length() + book.getAuthor().length();
        if (book.getSerialNum() == 0) {
            rate -= rand.nextInt();
        } else {
            rate -= book.getSerialNum();
        }
        if (book.getPageCount() == 0) {
            rate -= rand.nextInt();
        } else {
            rate += book.getPageCount();
        }
        System.out.println(book.getName() + " " + rate);
    }
}
