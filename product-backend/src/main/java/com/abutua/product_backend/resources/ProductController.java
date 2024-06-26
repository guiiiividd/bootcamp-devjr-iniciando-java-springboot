package com.abutua.product_backend.resources;

import org.springframework.web.bind.annotation.RestController;

import com.abutua.product_backend.models.Product;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {
    
    @GetMapping("product")
    public Product getProduct(){
        Product p = new Product();
        p.setId(1);
        p.setName("Nome do Produto");
        p.setPrice(100);
        return p;
    }
}
