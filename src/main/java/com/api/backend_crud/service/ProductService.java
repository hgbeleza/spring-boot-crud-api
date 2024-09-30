package com.api.backend_crud.service;

import com.api.backend_crud.dto.ProductDto;
import com.api.backend_crud.entity.Product;
import com.api.backend_crud.interfaces.IProductService;
import com.api.backend_crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository _productRepository;

    @Override
    public Product saveProduct(ProductDto productDto) {
        /**
         * Precisei converter o ProductDto para um Product pois a função
         * `save()` so aceita paramêtro desse tipo;
         */
        Product productModel = new Product();
        productModel.setProductName(productDto.getProductName());
        productModel.setProductDescription(productDto.getProductDescription());
        productModel.setProductQtd(productDto.getProductQtd());

        return _productRepository.save(productModel);
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> productList = _productRepository.findAll();
        return productList;
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
