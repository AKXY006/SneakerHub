package com.sneakerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerhub.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	// Inbuilt CRUD methods like save(), findAll(), findById(), deleteById() are available through JpaRepository.

}
