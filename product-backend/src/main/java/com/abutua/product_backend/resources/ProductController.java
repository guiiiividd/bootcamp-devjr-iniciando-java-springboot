package com.abutua.product_backend.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {
    
    @GetMapping("product")
    public String getProduct(){
        return "Eu sou o produto!";
    }
}
