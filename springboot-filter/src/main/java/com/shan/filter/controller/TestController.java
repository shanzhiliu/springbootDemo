package com.shan.filter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @Autowired
    private  Cars cars;

    @RequestMapping("/test")
    public String test() {
        cars.printNames();
        System.out.println("-----------------------------执行test----------------------------");
        return "test";
    }
}
