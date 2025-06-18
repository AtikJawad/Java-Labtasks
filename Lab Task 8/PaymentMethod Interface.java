interface PaymentMethod {
    boolean authorizePayment(double amount);
    void processPayment(double amount);
    void refundPayment(double amount);
}
