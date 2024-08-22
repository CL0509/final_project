package com.example.onlineshopping.service;

import com.example.onlineshopping.entity.CustomerOrder;
import com.example.onlineshopping.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public CustomerOrder createOrder(CustomerOrder customerOrder) {
        return orderRepository.save(customerOrder);
    }

    public List<CustomerOrder> getOrdersByUser(Long userId) {
        return orderRepository.findByUserId(userId);
    }


    public List<CustomerOrder> getOrdersByUserAndDateRange(Long userId, LocalDate startDate, LocalDate endDate) {
        return orderRepository.findByUserIdAndOrderDateBetween(userId, startDate, endDate);
    }
}
