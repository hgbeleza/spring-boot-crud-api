package com.api.backend_crud.service;

import com.api.backend_crud.dto.ProductDto;
import com.api.backend_crud.entity.Product;
import com.api.backend_crud.interfaces.IProductService;
import com.api.backend_crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository _productRepository;

    @Override
    public Product saveProduct(ProductDto productDto) {
    	try {
    		
    		/**
             * Precisei converter o ProductDto para um Product pois a função
             * `save()` so aceita paramêtro desse tipo;
             */
    		Product productModel = new Product();
            productModel.setProductName(productDto.getProductName());
            productModel.setProductDescription(productDto.getProductDescription());
            productModel.setProductQtd(productDto.getProductQtd());

            return _productRepository.save(productModel);
            
		} catch (Exception e) {
			throw new RuntimeException("Error ao salvar o produto: " + e.getMessage(), e);
		}
        
        
    }

    @Override
    public List<Product> getAllProducts() {
    	try {
    		return _productRepository.findAll();
		} catch (Exception e) {
			throw new RuntimeException("Error ao retornar os produtos: " + e.getMessage(), e);
		}
        
    }

    @Override
    public Product getProductById(Long id) {
    	try {
    		Optional<Product> productId = _productRepository.findById(id);
        	if(productId.isPresent()) {
        		return productId.get();
        	} else {
        		throw new RuntimeException("Produto não encontrado com o ID " + id);
        	}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao buscar produto com ID " + id + ": " + e.getMessage());
		}
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
