class Payment {
    void processPayment() {
        System.out.println("Processing payment...");
    }
}

class CreditCard extends Payment {
    void processPayment() {
        System.out.println("Payment processed using Credit Card");
    }
}

class DebitCard extends Payment {
    void processPayment() {
        System.out.println("Payment processed using Debit Card");
    }
}

class PayPal extends Payment {
    void processPayment() {
        System.out.println("Payment processed using PayPal");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.processPayment();

        p = new DebitCard();
        p.processPayment();

        p = new PayPal();
        p.processPayment();
    }
}
