package com.groceryshop.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BaseController {

	
	@RequestMapping("/")
	public ModelAndView mv() {
		
		return new ModelAndView("dashboard-admin");
	}
}
