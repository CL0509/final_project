package com.example.onlineshopping.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineshopping.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
    Coupon findByCode(String code);
}