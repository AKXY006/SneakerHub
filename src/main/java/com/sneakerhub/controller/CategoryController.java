package com.sneakerhub.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sneakerhub.entity.Category;
import com.sneakerhub.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/category")
	public Category saveCategory(@RequestBody Category category){    //Api to save one info
		return categoryService.saveCategory(category);
	}
}
