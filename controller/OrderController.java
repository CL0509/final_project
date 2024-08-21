package com.example.onlineshopping.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineshopping.entity.CustomerOrder;
import com.example.onlineshopping.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public CustomerOrder createOrder(@RequestBody CustomerOrder customerOrder) {
        return orderService.createOrder(customerOrder);
    }

    @GetMapping("/user/{userId}")
    public List<CustomerOrder> getOrdersByUser(@PathVariable("userId") Long userId) {  // Explicitly specify the name
        return orderService.getOrdersByUser(userId);
    }

    @GetMapping("/user/{userId}/date-range")
    public List<CustomerOrder> getOrdersByUserAndDateRange(
        @PathVariable("userId") Long userId,  
        @RequestParam("startDate") LocalDate startDate,  
        @RequestParam("endDate") LocalDate endDate  
    ) {
        return orderService.getOrdersByUserAndDateRange(userId, startDate, endDate);
    }
}
