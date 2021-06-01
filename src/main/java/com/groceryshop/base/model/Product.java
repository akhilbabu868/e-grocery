package com.groceryshop.base.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor

public class Product extends Base {

	private String productcode;
	private String product;
	private String description;
	private Double price;
	private Float  quantity;
	private byte[] image;
	
	public Product(String productcode, String product, String description, Double price, Float quantity, byte[] image) {
		super();
		this.productcode = productcode;
		this.product = product;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
	}

	
	
	
	
}
