package com.factoryMethod.solve.factory;

import org.springframework.stereotype.Component;

@Component("text")
public class TextDocument implements Document{
    public void open(){
        System.out.println("Opening Text Document...");
    }
}
