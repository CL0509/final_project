package com.example.onlineshopping.repository;

import com.example.onlineshopping.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
	Coupon findByCode(String code);
}
