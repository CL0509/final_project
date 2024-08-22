package com.example.onlineshopping.service;

import com.example.onlineshopping.dto.RatingDto;
import com.example.onlineshopping.entity.Product;
import com.example.onlineshopping.entity.Rating;
import com.example.onlineshopping.repository.RatingRepository;
import com.example.onlineshopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private ProductRepository productRepository;

    public Rating createRating(RatingDto ratingDto) {
        Product product = productRepository.findById(ratingDto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Rating rating = new Rating();
        rating.setStars(ratingDto.getStars());
        rating.setComment(ratingDto.getComment());
        rating.setProduct(product);

        return ratingRepository.save(rating);
    }

    public List<Rating> getRatingsByProduct(Long productId) {
        return ratingRepository.findByProductId(productId);
    }
}
