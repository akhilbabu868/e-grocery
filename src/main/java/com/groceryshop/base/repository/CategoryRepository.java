package com.groceryshop.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groceryshop.base.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
