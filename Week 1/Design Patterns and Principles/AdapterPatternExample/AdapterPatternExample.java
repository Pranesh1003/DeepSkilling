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
    private PayPal pp;

    public PayPalAdapter(PayPal p) {
        this.pp = p;
    }

    @Override
    public void processPayment(double amount) {
        pp.sendPayment(amount); 
    }
}

class StripeAdapter implements PaymentProcessor {
    private Stripe stripeClient;

    public StripeAdapter(Stripe stripeClient) {
        this.stripeClient = stripeClient;
    }

    @Override
    public void processPayment(double amount) {
        stripeClient.makePayment(amount); 
    }
}

public class AdapterPatternExample {
    public static void main(String[] args) {

        PayPal myPaypal = new PayPal();
        PaymentProcessor ppProcessor = new PayPalAdapter(myPaypal);
        ppProcessor.processPayment(10.00);  

        Stripe st = new Stripe();  
        PaymentProcessor stProcessor = new StripeAdapter(st);
        stProcessor.processPayment(15.00);  
    }
}
