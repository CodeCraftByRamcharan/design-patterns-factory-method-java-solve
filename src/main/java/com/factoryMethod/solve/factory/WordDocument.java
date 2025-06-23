package com.factoryMethod.solve.factory;

import org.springframework.stereotype.Component;

@Component("word")
public class WordDocument implements Document{
    public void open(){
        System.out.println("Opening Word Document...");
    }
}
