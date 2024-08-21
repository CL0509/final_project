package com.example.onlineshopping.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshopping.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByProductId(Long productId);
}