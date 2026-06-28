package com.sneakerhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sneakerhub.service.ReviewService;

@RestController
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	

}
