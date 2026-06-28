package com.sneakerhub.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneakerhub.entity.Category;
import com.sneakerhub.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public List<Category> getallCategories(){
		return categoryRepository.findAll();
	}
	
	public Category getCategoryById(Integer id) {
		return categoryRepository.findById(id).get();  // .get() is used to extract the actual Category object from Optional
	}
	
	public Category updateCategory(Category category) {
	    return categoryRepository.save(category);
	}
	
	public void deleteCategoryById(Integer id) {
		 categoryRepository.deleteById(id);
	}
	

	public Category updateCategory(Integer id, Map<String, Object> updates) {

	    Category category = categoryRepository.findById(id).get();

	    for (String key : updates.keySet()) {

	        Object value = updates.get(key);

	        switch (key) {

	            case "name":
	                category.setName((String) value);
	                break;

	            case "description":
	                category.setDescription((String) value);
	                break;

	            case "active":
	                category.setActive((Boolean) value);
	                break;

	            default:
	                break;
	        }
	    }
	    return categoryRepository.save(category);
	}
	
	
	
}
