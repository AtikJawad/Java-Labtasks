import java.util.*;

public class Main {
    public static void checkNumber(int number) throws ArithmeticException {
        if (number % 2 == 0) {
            throw new ArithmeticException("ERROR: Even number!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            checkNumber(num);
            System.out.println("Number is odd.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
