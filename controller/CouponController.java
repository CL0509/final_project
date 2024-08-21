package com.example.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineshopping.entity.Coupon;
import com.example.onlineshopping.service.CouponService;

@RestController
@RequestMapping("/api/coupons")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @GetMapping("/{code}")
    public Coupon getCouponByCode(@PathVariable("code") String code) {
        return couponService.getCouponByCode(code);
    }
}
