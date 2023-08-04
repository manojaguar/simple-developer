package com.mca.pgs.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mca.pgs.entity.Product;
import com.mca.pgs.service.ProductService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
	private final ProductService productService;

	@GetMapping("/get")
	public Page<Product> getProducts(@RequestParam int offset,@RequestParam int pagesize,@RequestParam String field) {
		return productService.findAllProducts(offset, pagesize, field);

	}
}