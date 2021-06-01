package com.groceryshop.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceryshop.base.model.Category;
import com.groceryshop.base.repository.CategoryRepository;
import com.groceryshop.base.service.CategoryService;

@Service
public class ICategoryService implements CategoryService {

	
	@Autowired
	CategoryRepository  categoryRepository;
	
	@Override
	public Category save(Category categoryobj) {
		// TODO Auto-generated method stub
		Category category = categoryRepository.save(categoryobj);
		return category;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	
	
}
