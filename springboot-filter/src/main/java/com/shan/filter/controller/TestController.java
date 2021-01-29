package com.shan.filter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @RequestMapping("/test")
    public String test() {
        System.out.println("-----------------------------执行test----------------------------");
        return "test";
    }
}
