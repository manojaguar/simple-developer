package com.mca.pgs.service;

import org.springframework.data.domain.Page;

import com.mca.pgs.entity.Product;

public interface ProductService {

	Page<Product> findAllProducts(int offset,int pagesize,String field);

}
