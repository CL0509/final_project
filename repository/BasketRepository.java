package com.example.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.onlineshopping.entity.Basket;

public interface BasketRepository extends JpaRepository<Basket, Long> {
    Basket findByUserId(Long userId);
}
