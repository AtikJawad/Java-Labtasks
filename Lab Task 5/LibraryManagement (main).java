
package labtask5;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("OOP Concepts", "John Doe", "Printed"));
        library.addBook(new Book("Java Basics", "Jane Smith", "E-Book"));
        library.addBook(new Book("Advanced Java", "Alan Turing", "Printed"));

        // Creating users
        Student student = new Student("Rahim");
        Teacher teacher = new Teacher("Karim Sir");

        library.displayAllBooks();

        // Borrowing
        Book book1 = library.searchBook("OOP Concepts");
        if (book1 != null) student.borrowBook(book1);

        Book book2 = library.searchBook("Java Basics");
        if (book2 != null) teacher.borrowBook(book2);

        library.displayAllBooks(); // Check availability after borrowing

        // Returning books with late days
        student.returnBook(book1, 3); // Student returns Printed book 3 days late (50% discount)
        teacher.returnBook(book2, 5); // Teacher returns E-book late (No fee)

        library.displayAllBooks(); // Check availability after returning

        // Searching for a non-existent book
        library.searchBook("Nonexistent Book");
    }
}
