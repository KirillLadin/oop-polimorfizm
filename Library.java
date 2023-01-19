package ru.tinkoff.fintech;

public class Library {
    public static void main(final String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("gore_ot_uma", "Griboedov");
        books[1] = new Book("Idiot", "Dostoevskiy", 3, 800);
        books[2] = new Book("Prestuplenie i nakazanie", "Dostoevskiy", 12);
        Reader kirill = new Reader();
        Book chosenBook = kirill.choiceBook(books);
        kirill.readBook(chosenBook);
        kirill.rateBook(chosenBook);
    }
}
