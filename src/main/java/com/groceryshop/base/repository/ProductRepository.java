package com.groceryshop.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groceryshop.base.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
