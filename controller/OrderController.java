package com.example.onlineshopping.controller;

import com.example.onlineshopping.entity.CustomerOrder;
import com.example.onlineshopping.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public CustomerOrder createOrder(@RequestBody CustomerOrder customerOrder) {
        return orderService.createOrder(customerOrder);
    }


    @GetMapping("/user/{userId}")
    public List<CustomerOrder> getOrdersByUser(@PathVariable("userId") Long userId) {
        return orderService.getOrdersByUser(userId);
    }

    @GetMapping("/user/{userId}/date-range")
    public List<CustomerOrder> getOrdersByUserAndDateRange(
            @PathVariable("userId") Long userId,
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return orderService.getOrdersByUserAndDateRange(userId, startDate, endDate);
    }

}
