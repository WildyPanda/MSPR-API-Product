package com.payetonkawa.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payetonkawa.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
