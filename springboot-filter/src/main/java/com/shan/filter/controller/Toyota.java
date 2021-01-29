package com.shan.filter.controller;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
class Toyota extends Car {
    public String getName() {
        return "Toyota";
    }
}