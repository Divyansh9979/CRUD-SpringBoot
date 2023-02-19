package com.example.divyansh.springboot.crud.repository;

import com.example.divyansh.springboot.crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
