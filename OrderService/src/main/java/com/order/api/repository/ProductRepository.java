package com.order.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
