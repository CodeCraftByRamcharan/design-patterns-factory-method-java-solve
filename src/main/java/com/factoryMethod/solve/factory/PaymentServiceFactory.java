package com.factoryMethod.solve.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentServiceFactory {

    @Autowired
    private List<PaymentProcessor> processors;

    public PaymentProcessor getProcessor(String type) {
        return processors.stream()
                .filter(p -> p.getClass().getSimpleName().toLowerCase().contains(type.toLowerCase()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown processor type"));
    }
}
