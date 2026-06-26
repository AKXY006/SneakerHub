package com.sneakerhub.service;

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


}
