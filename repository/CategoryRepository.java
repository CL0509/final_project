package com.example.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.onlineshopping.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
