package com.sneakerhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sneakerhub.service.BrandService;

@RestController
public class BrandController {
	
	@Autowired
	private BrandService brandService;

}
