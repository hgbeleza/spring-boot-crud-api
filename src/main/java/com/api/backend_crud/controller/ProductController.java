package com.api.backend_crud.controller;

import com.api.backend_crud.dto.ProductDto;
import com.api.backend_crud.entity.Product;
import com.api.backend_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public Product saveProduct(@RequestBody ProductDto productDto) {
        return productService.saveProduct(productDto);
    }
}
