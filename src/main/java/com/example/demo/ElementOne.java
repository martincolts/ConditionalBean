package com.example.demo;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ElementCondition.class)
public class ElementOne implements Element {
    @Override
    public String printSomething() {
        return "Element one";
    }
}
