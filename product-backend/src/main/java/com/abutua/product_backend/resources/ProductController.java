package com.abutua.product_backend.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.abutua.product_backend.models.Product;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductController {

    private List<Product> products = new ArrayList<>();

    @PostConstruct // Chama o método init() após a construção de ProductController
    public void init() {
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

        products.add(p1);
        products.add(p2);
        products.add(p3);
    }

    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        // if(id <= products.size()){
        // return ResponseEntity.ok(products.get(id - 1));
        // } else{
        // throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product Not Found");
        // }

        Product product = products.stream().filter(p -> p.getId() == id).findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product Not Found"));
        
        return ResponseEntity.ok(product);
    }

    @GetMapping("products")
    public List<Product> getProducts() {
        return products;
    }
}
