import java.util.Scanner;

// Custom Exception for Negative Number
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// Custom Exception for First Number Smaller than Second
class SmallerNumberException extends Exception {
    public SmallerNumberException(String message) {
        super(message);
    }
}

// Custom Exception for Division by Zero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Main {

    public static void checkMultiple(int num1, int num2)
            throws NegativeNumberException, SmallerNumberException, DivisionByZeroException {

        if (num1 < 0 || num2 < 0) {
            throw new NegativeNumberException("One or both numbers are negative.");
        }

        if (num2 == 0) {
            throw new DivisionByZeroException("Cannot divide by zero.");
        }

        if (num1 < num2) {
            throw new SmallerNumberException("First number is smaller than second number.");
        }

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is NOT a multiple of " + num2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        try {
            checkMultiple(num1, num2);
        } 
        catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (SmallerNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
