lass CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public boolean authorizePayment(double amount) {
        // Simple validation: check if card number is 16 digits and amount is positive
        if (cardNumber.length() == 16 && cardNumber.matches("\\d+")) {
            System.out.println("Credit Card authorization successful for $" + amount);
            return true;
        }
        System.out.println("Credit Card authorization failed: Invalid card number");
        return false;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " for " + cardHolderName);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding $" + amount + " to Credit Card ending in " + 
            cardNumber.substring(cardNumber.length() - 4));
    }
}
