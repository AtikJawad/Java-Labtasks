public class PaymentTest {
    public static void main(String[] args) {
        // Create payment method instances
        PaymentMethod creditCard = new CreditCard("1234567890123456", "John Doe");
        PaymentMethod payPal = new PayPal("john.doe@example.com", "secure123");

        // Test Credit Card payment flow
        System.out.println("=== Credit Card Payment Flow ===");
        double ccAmount = 100.00;
        if (creditCard.authorizePayment(ccAmount)) {
            creditCard.processPayment(ccAmount);
            creditCard.refundPayment(ccAmount);
        }

        System.out.println("\n=== PayPal Payment Flow ===");
        double ppAmount = 50.00;
        if (payPal.authorizePayment(ppAmount)) {
            payPal.processPayment(ppAmount);
            payPal.refundPayment(ppAmount);
        }

        // Test invalid Credit Card
        System.out.println("\n=== Invalid Credit Card Test ===");
        PaymentMethod invalidCard = new CreditCard("12345", "Jane Doe");
        double invalidAmount = 75.00;
        if (invalidCard.authorizePayment(invalidAmount)) {
            invalidCard.processPayment(invalidAmount);
            invalidCard.refundPayment(invalidAmount);
        }
    }
}
