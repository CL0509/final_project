package com.example.onlineshopping.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshopping.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);
}