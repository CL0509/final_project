package com.example.onlineshopping.repository;

import com.example.onlineshopping.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
    List<CustomerOrder> findByUserId(Long userId);
    List<CustomerOrder> findByUserIdAndOrderDateBetween(Long userId, LocalDate startDate, LocalDate endDate);
}
