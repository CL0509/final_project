package com.example.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshopping.entity.Rating;
import com.example.onlineshopping.repository.RatingRepository;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public List<Rating> getRatingsByProduct(Long productId) {
        return ratingRepository.findByProductId(productId);
    }
}