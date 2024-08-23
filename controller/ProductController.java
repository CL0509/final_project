package com.example.onlineshopping.controller;

import com.example.onlineshopping.dto.ProductDto;
import com.example.onlineshopping.entity.Product;
import com.example.onlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

    @PutMapping
    public Product updateProduct(@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable("categoryId") Long categoryId) {
        return productService.getProductsByCategory(categoryId);
    }


    @GetMapping("/price-range")
    public List<Product> getProductsByPriceRange(@RequestParam("minPrice") Double minPrice, @RequestParam("maxPrice") Double maxPrice) {  // Explicitly specify the names
        return productService.getProductsByPriceRange(minPrice, maxPrice);
    }


}
