public class Student extends User {

    public Student(String name) {
        super(name, 2); // Students can borrow up to 2 books
    }

    @Override
    public double calculateLateFee(Book book, int daysLate) {
        if (daysLate <= 0) return 0.0;
        if (book.getBookType().equalsIgnoreCase("Printed")) {
            return (5 * daysLate) * 0.5; // 50% discount
        }
        return 0.0; // No fee for E-Books
    }
}
