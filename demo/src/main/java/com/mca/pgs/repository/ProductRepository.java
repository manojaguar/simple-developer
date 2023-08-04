package com.mca.pgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mca.pgs.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
