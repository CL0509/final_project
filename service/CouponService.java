package com.example.onlineshopping.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshopping.entity.Coupon;
import com.example.onlineshopping.repository.CouponRepository;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    public Coupon getCouponByCode(String code) {
        return couponRepository.findByCode(code);
    }
}
