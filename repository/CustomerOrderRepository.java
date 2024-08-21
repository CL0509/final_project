package com.example.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshopping.entity.CustomerOrder;


import java.time.LocalDate;
import java.util.List;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
    List<CustomerOrder> findByUserId(Long userId);
    List<CustomerOrder> findByUserIdAndOrderDateBetween(Long userId, LocalDate startDate, LocalDate endDate);
}