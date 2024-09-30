package com.api.backend_crud.service;

import com.api.backend_crud.dto.ProductDto;
import com.api.backend_crud.entity.Product;
import com.api.backend_crud.interfaces.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    @Override
    public Product saveProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public Product updateProduct(Long id, ProductDto productDto) {
        return null;
    }

    @Override
    public String deleteProduct(Long id) {
        return "";
    }
}
