package com.factoryMethod.solve.service;

import com.factoryMethod.solve.factory.PaymentProcessor;
import org.springframework.stereotype.Service;

@Service
public class PayPalProcessor implements PaymentProcessor {

    public void process() {
        System.out.println("Processing PayPal payment");
    }
}
