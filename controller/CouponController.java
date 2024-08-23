package com.example.onlineshopping.controller;

import com.example.onlineshopping.entity.Coupon;
import com.example.onlineshopping.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupons")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @PostMapping
    public ResponseEntity<Coupon> createCoupon(@RequestBody Coupon coupon) {
        Coupon createdCoupon = couponService.createCoupon(coupon);
        return new ResponseEntity<>(createdCoupon, HttpStatus.CREATED);
    }
    
    @GetMapping("/{code}")
    public ResponseEntity<Coupon> getCouponByCode(@PathVariable("code") String code) {
        Coupon coupon = couponService.getCouponByCode(code);
        if (coupon != null) {
            return new ResponseEntity<>(coupon, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
   
}
