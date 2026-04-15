package com.Product_Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/product")
@RestController
public class product_controller {

    //Display all products
    @GetMapping("/getAll")
    public String display(){

        return "List of all Products from Product Service";
    }
}
