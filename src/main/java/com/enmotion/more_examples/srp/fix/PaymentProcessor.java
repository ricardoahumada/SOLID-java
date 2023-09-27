package com.enmotion.more_examples.srp.fix;

import com.enmotion.more_examples.srp.model.Payment;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(Payment payment) {
        paymentGateway.processPayment(payment);
    }
}
