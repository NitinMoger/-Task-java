package com.xworkz.coupligProgram;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;
    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void processPayment(double amount) {
        paymentGateway.processPayment(amount);
    }
}

