package com.sneakerhub.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sneakerhub.entity.Category;
import com.sneakerhub.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/category")                                         // Save a new category into the database
	public Category saveCategory(@RequestBody Category category){        
		return categoryService.saveCategory(category);
	}
	
	@GetMapping("/category/all")                                      //Fetch all category records from the database
	public List<Category> getallcategories(){
		return categoryService.getallCategories();
	}
	
	@GetMapping("/category/{id}")
	public Category findCategoryById(@PathVariable Integer id) {
		return categoryService.getCategoryById(id);
	}
	
	@PutMapping("/category")
	public Category updateCategory(@RequestBody Category category) {   //Full update Record
		return categoryService.updateCategory(category);
	}
	
	@PatchMapping("/category/{id}")
	public Category patchupdateCategory(@PathVariable Integer id, @RequestBody Map<String , Object> updates) {
		 return categoryService.updateCategory(id,updates);
	}
	
	
	@DeleteMapping("/category/{id}")
	public String deleteCategoryById(@PathVariable Integer id) {
		categoryService.deleteCategoryById(id);
		return "Delete SuccessFully ";
	}
	
	
	
	
	
	
}
