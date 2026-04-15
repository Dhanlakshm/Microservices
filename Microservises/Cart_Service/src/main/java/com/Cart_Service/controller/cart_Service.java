package com.Cart_Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cart_Service {

    @GetMapping("/cart")
    public String display(){
        return "Cart Service";
    }
}
