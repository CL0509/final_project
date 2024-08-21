package com.example.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshopping.entity.Basket;
import com.example.onlineshopping.repository.BasketRepository;

@Service
public class BasketService {
    @Autowired
    private BasketRepository basketRepository;

    public Basket getBasketByUser(Long userId) {
        return basketRepository.findByUserId(userId);
    }

    public Basket updateBasket(Basket basket) {
        return basketRepository.save(basket);
    }
}