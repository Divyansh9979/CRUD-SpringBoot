package com.example.divyansh.springboot.crud.service;

import com.example.divyansh.springboot.crud.entity.Product;
import com.example.divyansh.springboot.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> addProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductByID(int id){
        return productRepository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public void updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQty(product.getQty());
        existingProduct.setPrice(product.getPrice());
        productRepository.save(existingProduct);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
