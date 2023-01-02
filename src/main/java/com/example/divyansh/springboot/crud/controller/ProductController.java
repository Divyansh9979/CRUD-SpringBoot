package com.example.divyansh.springboot.CRUD.controller;

import com.example.divyansh.springboot.CRUD.entity.Product;
import com.example.divyansh.springboot.CRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/divyansh")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "Product Added Successfully..";
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.addProducts(products);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProductByID(@PathVariable int id){
        return productService.getProductByID(id);
    }

    @GetMapping("/getProductByName")
    public Product getProductByName(@RequestParam String name){
        return productService.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public String updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
        return "Product Updated...";
    }

    @DeleteMapping("/deleteProduct")
    public String deleteProduct(@RequestParam int id){
        productService.deleteProduct(id);
        return "Product Deleted...";
    }
}
