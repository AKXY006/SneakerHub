package com.sneakerhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneakerhub.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository repository;

}
