class PayPal implements PaymentMethod {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean authorizePayment(double amount) {
        // Simple validation: check if email is valid format and password is not empty
        if (email.contains("@") && !password.isEmpty()) {
            System.out.println("PayPal authorization successful for $" + amount);
            return true;
        }
        System.out.println("PayPal authorization failed: Invalid credentials");
        return false;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for " + email);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding $" + amount + " to PayPal account " + email);
    }
}
