package com.shan.filter.controller;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(50)
class Mazda extends Car {
    public String getName() {
        return "Mazda";
    }
}