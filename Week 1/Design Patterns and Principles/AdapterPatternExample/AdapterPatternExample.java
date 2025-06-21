package AdapterPatternExample;

interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPal {
    public void sendPayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

class Stripe {
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using Stripe.");
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}

class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}

public class AdapterPatternExample {
    public static void main(String[] args) {
        PayPal paypal = new PayPal();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(10);

        Stripe stripe = new Stripe();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(15);
    }
}
