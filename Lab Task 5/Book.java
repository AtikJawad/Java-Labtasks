package labtask5;

import java.util.Scanner;
public class Book {
    String title;
    String author;
    boolean isAvailable;
    String type; // Printed or E-Book

    Book(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.type = type;
    }
}
