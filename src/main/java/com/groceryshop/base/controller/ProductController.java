package com.groceryshop.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProductController {

	
	
	@RequestMapping("master/product")
	public ModelAndView product() {
		
		return new ModelAndView("product");
	}
}
