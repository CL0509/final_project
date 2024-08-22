package com.example.onlineshopping.service;

import com.example.onlineshopping.entity.Basket;
import com.example.onlineshopping.entity.User;
import com.example.onlineshopping.repository.BasketRepository;
import com.example.onlineshopping.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketService {
	
    @Autowired
    private BasketRepository basketRepository;

    @Autowired
    private UserRepository userRepository;
    
    public Basket getBasketByUser(Long userId) {
        return basketRepository.findByUserId(userId)
            .orElseGet(() -> {
                User user = userRepository.findById(userId)
                    .orElseThrow(() -> new RuntimeException("User not found"));
                Basket newBasket = new Basket();
                newBasket.setUser(user);
                return basketRepository.save(newBasket);
            });
    }

    public Basket updateBasket(Basket basket) {
        return basketRepository.save(basket);
    }
}
