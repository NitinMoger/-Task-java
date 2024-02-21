package com.xworkz.coupligProgram;

public class PaymentRunner {
    public static void main(String[] args) {
        // Creating payment processors with different payment gateways
        PaymentProcessor paypalProcessor = new PaymentProcessor(new PayPalPaymentGateway());
        PaymentProcessor stripeProcessor = new PaymentProcessor(new StripePaymentGateway());

        // Processing payments
        paypalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(50.0);
    }
}
