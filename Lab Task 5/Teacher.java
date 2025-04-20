public class Teacher extends User {

    public Teacher(String name) {
        super(name, 3); // Teachers can borrow up to 3 books
    }

    @Override
    public double calculateLateFee(Book book, int daysLate) {
        return 0.0; // No late fee for teachers
    }
}
