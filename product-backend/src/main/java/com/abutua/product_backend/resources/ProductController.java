package com.abutua.product_backend.resources;

import org.springframework.web.bind.annotation.RestController;

import com.abutua.product_backend.models.Product;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("products")
    public List<Product> getProducts(){
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Nome do Produto 01");
        p1.setPrice(100);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Nome do Produto 02");
        p2.setPrice(200);

        Product p3 = new Product();
        p3.setId(3);
        p3.setName("Nome do Produto 03");
        p3.setPrice(300);

        List<Product> productsList = new ArrayList<>();
        productsList.add(p1);
        productsList.add(p2);
        productsList.add(p3);

        return productsList;
    }
}
