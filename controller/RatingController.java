package com.example.onlineshopping.controller;

import com.example.onlineshopping.dto.RatingDto;
import com.example.onlineshopping.entity.Rating;
import com.example.onlineshopping.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public Rating createRating(@RequestBody RatingDto ratingDto) {
        return ratingService.createRating(ratingDto);
    }

    @GetMapping("/ratings/product/{productId}")
    public List<Rating> getRatingsByProduct(@PathVariable("productId") Long productId) {
        return ratingService.getRatingsByProduct(productId);
    }


}
