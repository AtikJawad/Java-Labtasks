
package labtask5;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayInfo();
                return book;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    public void displayAllBooks() {
        System.out.println("\n--- Library Books ---");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
