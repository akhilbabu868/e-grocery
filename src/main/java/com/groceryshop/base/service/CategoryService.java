package com.groceryshop.base.service;

import java.util.List;

import com.groceryshop.base.model.Category;




public interface CategoryService {

	
   public Category save(Category category);
	
	List<Category> getAll();
}
