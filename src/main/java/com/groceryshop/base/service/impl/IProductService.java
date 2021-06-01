package com.groceryshop.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceryshop.base.model.Product;
import com.groceryshop.base.repository.ProductRepository;
import com.groceryshop.base.service.ProductService;

@Service
public class IProductService implements ProductService{

	@Autowired
	ProductRepository  	productRepository;
	
	
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
