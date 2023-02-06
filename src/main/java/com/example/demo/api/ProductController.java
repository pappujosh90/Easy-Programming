package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    IProductService iProductService;

    @GetMapping("/product")
    public List<Product> getProduct() {
        return iProductService.findAll();
    }
}
