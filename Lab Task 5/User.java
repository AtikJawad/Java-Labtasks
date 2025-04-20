
package labtask5;

import java.util.ArrayList;

public abstract class User {
    protected String name;
    protected int maxBooks;
    protected ArrayList<Book> borrowedBooks;

    public User(String name, int maxBooks) {
        this.name = name;
        this.maxBooks = maxBooks;
        this.borrowedBooks = new ArrayList<>();
    }

    public abstract double calculateLateFee(Book book, int daysLate);

    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() < maxBooks && book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailability(false);
            System.out.println(name + " borrowed \"" + book.getTitle() + "\"");
            return true;
        } else {
            System.out.println("Cannot borrow book. Limit reached or book not available.");
            return false;
        }
    }

    public void returnBook(Book book, int daysLate) {
        if (borrowedBooks.contains(book)) {
            double fee = calculateLateFee(book, daysLate);
            borrowedBooks.remove(book);
            book.setAvailability(true);
            System.out.println(name + " returned \"" + book.getTitle() + "\". Late Fee: " + fee + " Tk.");
        } else {
            System.out.println("This book was not borrowed by " + name + ".");
        }
    }
}

