package com.factoryMethod.solve.factory;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfDocument implements Document{
    public void open(){
        System.out.println("Opening PDF Document...");
    }
}
