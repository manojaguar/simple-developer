package com.mca.pgs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private long price;
	
	public Product(String name, int quantity, long price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}	
	
}
