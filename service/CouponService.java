package com.example.onlineshopping.service;

import com.example.onlineshopping.entity.Coupon;
import com.example.onlineshopping.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;
    
    public Coupon createCoupon(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    public Coupon getCouponByCode(String code) {
        return couponRepository.findByCode(code);
    }
}
