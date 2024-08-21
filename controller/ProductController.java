package com.example.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.onlineshopping.entity.Product;
import com.example.onlineshopping.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) { 
        productService.deleteProduct(id);
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable("categoryId") Long categoryId) {  
        return productService.getProductsByCategory(categoryId);
    }

    @GetMapping("/price-range")
    public List<Product> getProductsByPriceRange(@RequestParam("minPrice") Double minPrice, @RequestParam("maxPrice") Double maxPrice) {  
        return productService.getProductsByPriceRange(minPrice, maxPrice);
    }
}
