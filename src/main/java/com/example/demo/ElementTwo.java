package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ElementTwo implements Element {

    @Override
    public String printSomething() {
        return "Element two";
    }
}
