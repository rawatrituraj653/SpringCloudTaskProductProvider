package com.prod.producer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prod.producer.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{


}
