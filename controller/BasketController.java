package com.example.onlineshopping.controller;

import com.example.onlineshopping.entity.Basket;
import com.example.onlineshopping.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/baskets")
public class BasketController {
    @Autowired
    private BasketService basketService;

    @GetMapping("/user/{userId}")
    public Basket getBasketByUser(@PathVariable("userId") Long userId) {
        return basketService.getBasketByUser(userId);
    }


    @PutMapping
    public Basket updateBasket(@RequestBody Basket basket) {
        return basketService.updateBasket(basket);
    }
}
