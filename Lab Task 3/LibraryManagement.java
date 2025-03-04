
package labtask5;

import java.util.*;

public class LibraryManagement {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(5);

        library.addBook("Java Programming", "Author A", "Printed");
        library.addBook("Python Basics", "Author B", "E-Book");

        User student = new User("Alice", "Student");
        User teacher = new User("Bob", "Teacher");

        library.searchBook("Java Programming");
        
        student.borrowBook(library.getAvailableBook("Java Programming"));
        student.returnBook("Java Programming", 3);

        teacher.borrowBook(library.getAvailableBook("Python Basics"));
        teacher.returnBook("Python Basics", 5);

        scanner.close();
    }
    
}
