interface Payment {
    void makePayment(double amount);
}

class CreditCardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + String.format("%.2f", amount) + " successful using credit card.");
    }
}

class DebitCardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + String.format("%.2f", amount) + " successful using debit card.");
    }
}

class CashPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + String.format("%.2f", amount) + " successful using cash.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment creditPayment = new CreditCardPayment();
        Payment debitPayment = new DebitCardPayment();
        Payment cashPayment = new CashPayment();

        creditPayment.makePayment(100.0);
        debitPayment.makePayment(50.0);
        cashPayment.makePayment(25.0);
    }
}
