package labtask5;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private String bookType; // "Printed" or "E-Book"

    public Book(String title, String author, String bookType) {
        this.title = title;
        this.author = author;
        this.bookType = bookType;
        this.isAvailable = true; // Default: Available
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getBookType() { return bookType; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Status: " + (isAvailable ? "Available" : "Not Available"));
    }
}
