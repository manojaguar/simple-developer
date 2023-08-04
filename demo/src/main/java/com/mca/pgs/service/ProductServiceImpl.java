package com.mca.pgs.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.mca.pgs.entity.Product;
import com.mca.pgs.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	private final ProductRepository productRepository;

	@PostConstruct
	public void initDb() {
		List<Product> products = IntStream.rangeClosed(1, 200)
				.mapToObj(i -> new Product("Product" + i, new Random().nextInt(100), new Random().nextInt(50000)))
				.collect(Collectors.toList());
		productRepository.saveAll(products);
		
	}

	@Override
	public Page<Product> findAllProducts(int offset, int pagesize, String field) {
		Page<Product> products = productRepository.findAll(PageRequest.of(offset, pagesize).withSort(Sort.by(field)));
		return products;
	}
	
	
	
}
