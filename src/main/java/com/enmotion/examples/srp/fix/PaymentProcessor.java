package com.enmotion.examples.srp.fix;

import com.enmotion.examples.srp.model.Payment;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(Payment payment) {
        paymentGateway.processPayment(payment);
    }
}
