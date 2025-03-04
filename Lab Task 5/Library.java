
package labtask5;

import java.util.*;
public class Library {
    Book[] books;
    int bookCount;

    Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    void addBook(String title, String author, String type) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author, type);
            System.out.println("Book added: " + title);
        } else {
            System.out.println("Library is full!");
        }
    }

    void searchBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equals(title)) {
                System.out.println("Found: " + books[i].title + " by " + books[i].author + " - " + 
                                  (books[i].isAvailable ? "Available" : "Not Available"));
                return;
            }
        }
        System.out.println("Book not found.");
    }

    Book getAvailableBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equals(title) && books[i].isAvailable) {
                return books[i];
            }
        }
        return null;
    }
}
