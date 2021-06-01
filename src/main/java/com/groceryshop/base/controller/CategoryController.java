package com.groceryshop.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.groceryshop.base.model.Category;
import com.groceryshop.base.service.impl.ICategoryService;

@RestController
public class CategoryController {

	@Autowired
	ICategoryService categoryService;
	
	
	@RequestMapping("master/category")
	public ModelAndView category() {
		
		return new ModelAndView("category");
	}
	
	
	@PostMapping("master/category/add")  
	private Category saveBook(Category objcategory)   
	{  
	Category category =	categoryService.save(objcategory);
	return category;
	}  
}
