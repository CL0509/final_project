package com.example.onlineshopping.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshopping.entity.CustomerOrder;
import com.example.onlineshopping.repository.CustomerOrderRepository;


@Service
public class OrderService {
    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    public CustomerOrder createOrder(CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }

    public List<CustomerOrder> getOrdersByUser(Long userId) {
        return customerOrderRepository.findByUserId(userId);
    }

    public List<CustomerOrder> getOrdersByUserAndDateRange(Long userId, LocalDate startDate, LocalDate endDate) {
        return customerOrderRepository.findByUserIdAndOrderDateBetween(userId, startDate, endDate);
    }
}