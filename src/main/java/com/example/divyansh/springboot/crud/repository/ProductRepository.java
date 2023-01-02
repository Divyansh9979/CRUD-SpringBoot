package com.example.divyansh.springboot.CRUD.repository;

import com.example.divyansh.springboot.CRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
