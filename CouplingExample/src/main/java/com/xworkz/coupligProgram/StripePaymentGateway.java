package com.xworkz.coupligProgram;

public class StripePaymentGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of :" + amount + " via Stripe.");

    }
}
