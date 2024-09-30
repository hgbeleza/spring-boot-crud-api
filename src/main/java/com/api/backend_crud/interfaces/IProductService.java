package com.api.backend_crud.interfaces;

import com.api.backend_crud.dto.ProductDto;
import com.api.backend_crud.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    Product saveProduct(ProductDto productDto);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Long id, ProductDto productDto);
    String deleteProduct(Long id);
}