
package labtask5;

import java.util.*;
public class User {
    String name;
    String userType; // Student or Teacher
    int borrowedCount = 0;
    Book[] borrowedBooks = new Book[3]; // Max books a teacher can borrow

    User(String name, String userType) {
        this.name = name;
        this.userType = userType;
    }

    boolean canBorrow() {
        if (userType.equals("Student")) {
            return borrowedCount < 2;
        } else {
            return borrowedCount < 3;
        }
    }

    void borrowBook(Book book) {
        if (canBorrow() && book.isAvailable) {
            borrowedBooks[borrowedCount++] = book;
            book.isAvailable = false;
            System.out.println(name + " borrowed " + book.title);
        } else {
            System.out.println("Cannot borrow book.");
        }
    }

    void returnBook(String title, int daysLate) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i].title.equals(title)) {
                borrowedBooks[i].isAvailable = true;
                System.out.println(name + " returned " + title);
                calculateLateFee(daysLate, borrowedBooks[i]);
                borrowedBooks[i] = null;
                borrowedCount--;
                return;
            }
        }
        System.out.println("Book not found in borrowed list.");
    }

    void calculateLateFee(int daysLate, Book book) {
        if (daysLate > 0 && book.type.equals("Printed")) {
            int fine = daysLate * 5;
            if (userType.equals("Student")) fine /= 2;
            if (userType.equals("Teacher")) fine = 0;
            System.out.println("Late fee: " + fine + "Tk");
        }
    }
}
